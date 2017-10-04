package com.example.dm2.layouts2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        setTitle("Operar");
    }

    public void operacion(View v){
        v.getId();

        EditText primero = (EditText)findViewById(R.id.primerEdit);
        EditText segundo = (EditText)findViewById(R.id.segundoEdit);
        float valor1 = Float.parseFloat(primero.getText().toString());
        float valor2 = Float.parseFloat(segundo.getText().toString());

        TextView lblResultado = (TextView)findViewById(R.id.resultado);
        float resultado = 0;

        switch (v.getId()){
            case R.id.btnSuma:
                resultado = valor1+valor2;
                break;
            case R.id.btnResta:
                resultado = valor1-valor2;
                break;
            case R.id.btnMulti:
                resultado = valor1*valor2;
                break;
            case R.id.btnDiv:
                resultado = valor1/valor2;
                break;
            default:
                resultado = 3.33f;
                break;
        }
        lblResultado.setText(getString(R.string.resultado)+" "+resultado);
    }
}
