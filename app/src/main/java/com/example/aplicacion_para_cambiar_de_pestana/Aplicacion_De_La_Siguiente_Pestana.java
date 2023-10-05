package com.example.aplicacion_para_cambiar_de_pestana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.provider.MediaStore;
import android.provider.Settings;
import android.provider.ContactsContract;
import android.widget.Button;

public class Aplicacion_De_La_Siguiente_Pestana extends AppCompatActivity {
    Button explicito1;
    Button explicito2;
    Button explicito3;
    Button explicito4;
    Button implicito1;
    Button implicito2;
    Button implicito3;
    Button implicito4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicacion_de_la_siguiente_pestana);

        implicito1 = findViewById(R.id.introvertido_uno);
        Intent intent1 = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        implicito1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });

        implicito2 = findViewById(R.id.introvertido_dos);
        Intent intent2 = new Intent(Intent.ACTION_VIEW);
        implicito2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent2.setData(Uri.parse("https://www.google.com"));
                startActivity(intent2);

            }
        });

        implicito3 = findViewById(R.id.introvertido_tres);
        Intent intent3 = new Intent(Intent.ACTION_DIAL);
        implicito3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent3.setData(Uri.parse("tel:8713827723"));
                startActivity(intent3);

            }
        });

        implicito4 = findViewById(R.id.introvertido_cuatro);
        Intent intent4 = new Intent(Intent.ACTION_SENDTO);
        implicito4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent4.setData(Uri.parse("mailto:mariapamelaoronavalero@gmail.com"));
                intent4.putExtra(Intent.EXTRA_SUBJECT, "Prueba del intent");
                intent4.putExtra(Intent.EXTRA_TEXT, "Hola <3");
                startActivity(intent4);
            }
        });

        explicito1 = findViewById(R.id.extrovertido_uno);
        Intent intent5 = new Intent("android.media.action.IMAGE_CAPTURE");
        explicito1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent5);
            }
        });

        explicito2 = findViewById(R.id.extrovertido_dos);
        Intent intent6 = new Intent(this, MainActivity.class);
        explicito2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent6);
            }
        });

        explicito3 = findViewById(R.id.extrovertido_tres);
        Intent intent7 = new Intent(Settings.ACTION_SETTINGS);
        explicito3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent7);
            }
        });

        explicito4 = findViewById(R.id.extrovertido_cuatro);
        Intent intent8 = new Intent(Intent.ACTION_VIEW, ContactsContract.Contacts.CONTENT_URI);
        explicito4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent8);
            }
        });
    }
}