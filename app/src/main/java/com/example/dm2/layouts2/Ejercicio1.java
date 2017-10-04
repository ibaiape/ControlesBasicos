package com.example.dm2.layouts2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Sumar");
        setContentView(R.layout.activity_ejercicio1);
        Button btnSuma = (Button)findViewById(R.id.boton);
       /* btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText primero = (EditText)findViewById(R.id.primerEdit);
                EditText segundo = (EditText)findViewById(R.id.segundoEdit);
                TextView resultado = (TextView)findViewById(R.id.resultado);
                int valor1 = Integer.parseInt(primero.getText().toString());
                int valor2 = Integer.parseInt(segundo.getText().toString());
                int suma = valor1+valor2;
                resultado.setText(getString(R.string.laSuma)+" "+suma);
            }
        });*/
       btnSuma.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText primero = (EditText)findViewById(R.id.primerEdit);
        EditText segundo = (EditText)findViewById(R.id.segundoEdit);
        TextView resultado = (TextView)findViewById(R.id.resultado);
        int valor1 = Integer.parseInt(primero.getText().toString());
        int valor2 = Integer.parseInt(segundo.getText().toString());
        int suma = valor1+valor2;
        resultado.setText(getString(R.string.laSuma)+" "+suma);
    }
}
