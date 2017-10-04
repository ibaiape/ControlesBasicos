package com.example.dm2.layouts2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Ejercicio4 extends AppCompatActivity {

    String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
    EditText txtNum;
    EditText txtLetra;
    TextView resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);
        setTitle("Letra DNI");
        txtNum = (EditText)findViewById(R.id.txtNumero);
        txtLetra = (EditText)findViewById(R.id.txtLetra);
        resul = (TextView)findViewById(R.id.resultado);
    }

    public void comprobar(View v){
        resul.setText(letrasDNI.charAt(Integer.parseInt(txtNum.getText().toString())%23)==txtLetra.getText().toString().charAt(0) ? "El DNI es válido":"El DNI no es válido");
    }
}
