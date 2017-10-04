package com.example.dm2.layouts2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Ejercicio3 extends AppCompatActivity {

    private LinearLayout lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);
        setTitle("Encender/apagar");
    }

    public void apagar(View v){
        lay = (LinearLayout)findViewById(R.id.principal);
        lay.setBackgroundColor(Color.GRAY);
    }
    public void encender(View v){
        lay = (LinearLayout)findViewById(R.id.principal);
        lay.setBackgroundColor(Color.YELLOW);
    }
}
