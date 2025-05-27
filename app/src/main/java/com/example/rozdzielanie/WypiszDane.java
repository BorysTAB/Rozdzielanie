package com.example.rozdzielanie;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WypiszDane extends AppCompatActivity {
    Asystent pm = new Asystent(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_wypisz_dane);

        TextView tekst = findViewById(R.id.tekst1);
        Cursor k = pm.wypiszCalosc();

        while (k.moveToNext()) {
            int id = k.getInt(0);
            String imie2 = k.getString(1);
            String nazwisko2 = k.getString(2);
            String klasa2 = k.getString(3);
            tekst.setText(tekst.getText() + "\n" + id + ". " + imie2 + " " + nazwisko2 + " " + klasa2);
        }
    }
    public void wpisz(View view) {
        startActivity(new Intent(this, WprowadzDane.class));
    }
}