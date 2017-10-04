package com.example.dm2.layouts2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Ejercicio6 extends AppCompatActivity {
    boolean bCam1=true ,bCam2 = true, bLuz1 = false, bLuz2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);
    }

    public void clickCamara1(View v){
        Button camara1 = (Button)findViewById(R.id.btnCamara1);
        bCam1=!bCam1;
        if(bCam1)
            camara1.setVisibility(View.VISIBLE);
        else
            camara1.setVisibility(View.INVISIBLE);
    }

    public void clickLuz1(View v){
        ToggleButton luz1 = (ToggleButton)findViewById(R.id.toggleBombilla1);
        bLuz1=!bLuz1;
        luz1.setChecked(bLuz1);
    }

    public void clickCamara2(View v){
        Button camara2 = (Button)findViewById(R.id.btnCamara2);
        bCam2=!bCam2;
        if(bCam2)
            camara2.setVisibility(View.VISIBLE);
        else
            camara2.setVisibility(View.INVISIBLE);
    }

    public void clickLuz2(View v){
        ToggleButton luz2 = (ToggleButton)findViewById(R.id.toggleBombilla2);
        bLuz2=!bLuz2;
        luz2.setChecked(bLuz2);
    }
}
