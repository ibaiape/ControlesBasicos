package com.example.dm2.layouts2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ejercicio5 extends AppCompatActivity implements View.OnClickListener {

    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);
        setTitle("Click Botones");
        Button btnYahoo = (Button)findViewById(R.id.btnYahoo);
        Button btnBing = (Button)findViewById(R.id.btnBing);
        btnYahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagen = (ImageView)findViewById(R.id.contImagen);
                imagen.setImageResource(R.drawable.yahoo);
            }
        });
        btnBing.setOnClickListener(this);
    }

    public void mostrarGoogle(View v){
        imagen = (ImageView)findViewById(R.id.contImagen);
        imagen.setImageResource(R.drawable.google);
    }

    @Override
    public void onClick(View v) {
        imagen = (ImageView)findViewById(R.id.contImagen);
        imagen.setImageResource(R.drawable.bing);
    }

}
