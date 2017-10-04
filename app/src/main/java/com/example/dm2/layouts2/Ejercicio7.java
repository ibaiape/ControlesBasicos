package com.example.dm2.layouts2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Ejercicio7 extends AppCompatActivity {
    int temp = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);
    }

    public void clickCamara1(View v){
        Switch swt = (Switch)v;
        Button camara1 = (Button)findViewById(R.id.btnCamara1);
        if(swt.isChecked())
            camara1.setVisibility(View.VISIBLE);
        else
            camara1.setVisibility(View.INVISIBLE);
    }

    public void clickLuz1(View v){
        Switch swt = (Switch)v;
        ToggleButton luz1 = (ToggleButton)findViewById(R.id.toggleBombilla1);
        luz1.setChecked(swt.isChecked());
    }

    public void clickCamara2(View v){
        ToggleButton tgl = (ToggleButton)v;
        Button camara2 = (Button)findViewById(R.id.btnCamara2);
        if(tgl.isChecked())
            camara2.setVisibility(View.VISIBLE);
        else
            camara2.setVisibility(View.INVISIBLE);
    }

    public void clickLuz2(View v){
        ToggleButton tgl = (ToggleButton)v;
        ToggleButton luz2 = (ToggleButton)findViewById(R.id.toggleBombilla2);
        luz2.setChecked(tgl.isChecked());
    }

    public void clickTempMenos(View v){
        TextView txtTemp = (TextView)findViewById(R.id.txtTemp);
        temp--;
        txtTemp.setText(Integer.toString(temp));
        checkTemp();
    }

    public void clickTempMas(View v){
        TextView txtTemp = (TextView)findViewById(R.id.txtTemp);
        temp++;
        txtTemp.setText(Integer.toString(temp));
        checkTemp();
    }

    private void checkTemp(){
        Button btnMenos = (Button)findViewById(R.id.btnMenos);
        Button btnMas = (Button)findViewById(R.id.btnMas);
        btnMenos.setEnabled(temp!=15);
        btnMas.setEnabled(temp!=25);
    }

    public void clickPer1(View v){
        CheckBox chk = (CheckBox)v;
        Button persiana1 = (Button)findViewById(R.id.btnPersiana1);
        if(chk.isChecked())
            persiana1.setVisibility(View.VISIBLE);
        else
            persiana1.setVisibility(View.INVISIBLE);
    }

    public void clickPer2(View v){
        CheckBox chk = (CheckBox)v;
        Button persiana2 = (Button)findViewById(R.id.btnPersiana2);
        if(chk.isChecked())
            persiana2.setVisibility(View.VISIBLE);
        else
            persiana2.setVisibility(View.INVISIBLE);
    }

    public void clickPer3(View v){
        CheckBox chk = (CheckBox)v;
        Button persiana3 = (Button)findViewById(R.id.btnPersiana3);
        if(chk.isChecked())
            persiana3.setVisibility(View.VISIBLE);
        else
            persiana3.setVisibility(View.INVISIBLE);
    }

    public void clickPer4(View v){
        CheckBox chk = (CheckBox)v;
        Button persiana4 = (Button)findViewById(R.id.btnPersiana4);
        if(chk.isChecked())
            persiana4.setVisibility(View.VISIBLE);
        else
            persiana4.setVisibility(View.INVISIBLE);
    }

    public void clickPerTodas(View v){
        CheckBox chk = (CheckBox)v;
        CheckBox chk1 = (CheckBox)findViewById(R.id.chkPersiana1);
        CheckBox chk2 = (CheckBox)findViewById(R.id.chkPersiana2);
        CheckBox chk3 = (CheckBox)findViewById(R.id.chkPersiana3);
        CheckBox chk4 = (CheckBox)findViewById(R.id.chkPersiana4);
        Button persiana1 = (Button)findViewById(R.id.btnPersiana1);
        Button persiana2 = (Button)findViewById(R.id.btnPersiana2);
        Button persiana3 = (Button)findViewById(R.id.btnPersiana3);
        Button persiana4 = (Button)findViewById(R.id.btnPersiana4);
        Boolean isChecked = chk.isChecked();
        chk1.setChecked(isChecked);
        chk2.setChecked(isChecked);
        chk3.setChecked(isChecked);
        chk4.setChecked(isChecked);
        if(isChecked) {
            persiana1.setVisibility(View.VISIBLE);
            persiana2.setVisibility(View.VISIBLE);
            persiana3.setVisibility(View.VISIBLE);
            persiana4.setVisibility(View.VISIBLE);
        }else {
            persiana1.setVisibility(View.INVISIBLE);
            persiana2.setVisibility(View.INVISIBLE);
            persiana3.setVisibility(View.INVISIBLE);
            persiana4.setVisibility(View.INVISIBLE);
        }
    }
}
