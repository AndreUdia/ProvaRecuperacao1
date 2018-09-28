package com.example.andre.provarecuperacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    double button = 25.00;
    double button6 = 27.25;
    double button7 = 35.00;
    double button8 = 21.50;
    double button9 = 23.00;
    double resultado = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calcular(View v){
        TextView temp = findViewById(R.id.resultado);

        if(v.getId() == R.id.button){
            resultado += button;
        }
        if(v.getId() == R.id.button6){
            resultado += button6;
        }
        if(v.getId() == R.id.button7){
            resultado += button7;
        }
        if(v.getId() == R.id.button8){
            resultado += button8;
        }
        if(v.getId() == R.id.button9){
            resultado += button9;
        }

        String res = Double.toString(resultado);

        temp.setText(res.replace(".", "."));
    }
}
