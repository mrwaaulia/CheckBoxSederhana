package com.example.checkboxsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox ayam1, ayam2, ayam3;
    private String menu1, menu2, menu3;
    private Button pesan;
    private TextView pilihan1, pilihan2, pilihan3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Menginisialisasi ID Pda Semua Elemen UI
        ayam1 = findViewById(R.id.ayam1);
        ayam2 = findViewById(R.id.ayam2);
        ayam3 = findViewById(R.id.ayam3);
        pilihan1 = findViewById(R.id.menu_satu);
        pilihan2 = findViewById(R.id.menu_dua);
        pilihan3 = findViewById(R.id.menu_tiga);
        pesan = findViewById(R.id.pesan);

        //Saat Tombol Diklik Maka Akan mengeksekusi Pesanan dari User
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Melihat Status Kondisi Pada Plihan Menu Ayam Geprek
                if (ayam1.isChecked()){
                    menu1 = "Ayam Geprek";
                }else if (!ayam1.isChecked()){
                    menu1 = " ";
                }

                //Melihat Status Kondisi Pada Pilihian Menu Ayam Bakar
                if (ayam2.isChecked()){
                    menu2 = "Ayam Bakar";
                }else if (!ayam2.isChecked()){
                    menu2 = " ";
                }

                //Melihat Status Kondisi Pada Pilihan Menu Soto Ayam
                if (ayam3.isChecked()){
                    menu3 = "Soto Ayam";
                }else if (!ayam3.isChecked()){
                    menu3 = " ";
                }

                //Kondisi Jika Tidak Ada Salah Satupun Menu Makanan Yang Dipilih
                if (!ayam1.isChecked() && !ayam2.isChecked() && !ayam3.isChecked()){
                    Toast.makeText(MainActivity.this, "Tidak Ada Menu Makanan yang Dipesan", Toast.LENGTH_SHORT).show();
                }else{
                    //Menampilkan Hasil Pesanan Yang Di Input Dari User
                    Toast.makeText(MainActivity.this, "Pesanan Terkirim", Toast.LENGTH_SHORT).show();
                    pilihan1.setText("Menu 1 : " + menu1);
                    pilihan2.setText("Menu 2 : " + menu2);
                    pilihan3.setText("Menu 3 : " + menu3);

                }
            }
        });

    }
}