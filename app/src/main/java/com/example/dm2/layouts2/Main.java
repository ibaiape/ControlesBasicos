package com.example.dm2.layouts2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void Ejercicio1(View v){
        Intent Ejer1 = new Intent(Main.this, Ejercicio1.class);
        startActivity(Ejer1);
    }

    public void Ejercicio2(View v){
        Intent Ejer2 = new Intent(Main.this, Ejercicio2.class);
        startActivity(Ejer2);
    }

    public void Ejercicio3(View v){
        Intent Ejer3 = new Intent(Main.this, Ejercicio3.class);
        startActivity(Ejer3);
    }

    public void Ejercicio4(View v){
        Intent Ejer4 = new Intent(Main.this, Ejercicio4.class);
        startActivity(Ejer4);
    }

    public void Ejercicio5(View v){
        Intent Ejer5 = new Intent(Main.this, Ejercicio5.class);
        startActivity(Ejer5);
    }

    public void Ejercicio6(View v){
        Intent Ejer6 = new Intent(Main.this, Ejercicio6.class);
        startActivity(Ejer6);
    }

    public void Ejercicio7(View v){
        Intent Ejer7 = new Intent(Main.this, Ejercicio7.class);
        startActivity(Ejer7);
    }

}
