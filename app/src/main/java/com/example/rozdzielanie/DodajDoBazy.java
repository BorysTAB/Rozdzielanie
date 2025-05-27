package com.example.rozdzielanie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DodajDoBazy extends AppCompatActivity {
    Asystent pm = new Asystent(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dodaj_do_bazy);
        Bundle bundle = getIntent().getExtras();
        String imie = bundle.getString("imie");
        String nazwisko = bundle.getString("nazwisko");
        String klasa = bundle.getString("klasa");
        pm.dodaj(imie, nazwisko, klasa);
    }
    public void wypisz(View view) {
        startActivity(new Intent(this, WypiszDane.class));
    }
    public void wpisz(View view) {
        startActivity(new Intent (this, WprowadzDane.class));
    }
}