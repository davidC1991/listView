package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cilindro extends AppCompatActivity {
    private EditText radio;
    private EditText altura;
    private TextView volumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);

        radio= findViewById(R.id.txtValorRadioCilindro);
        altura= findViewById(R.id.txtValorAlturaCilindro);
        volumen= findViewById(R.id.lblValorVolumenCilindro);
    }
    public void calcularCilindro(View v){
        int r,h,ar;
        if(validar1()) {
            r = Integer.parseInt(radio.getText().toString());
            h = Integer.parseInt(altura.getText().toString());
            ar = (int) 3.14 * (r * r * h);
            volumen.setText("" + ar);
        }
    }

    public boolean validar1(){
        boolean vacio=true;

        String c1= radio.getText().toString();
        String c2= altura.getText().toString();

        if(c1.isEmpty()){
            radio.setError("Ingrese el radio");
            vacio=false;
        }
        if(c2.isEmpty()){
            altura.setError("Ingrese la altura");
            vacio=false;
        }


        return vacio;
    }
    public void onBackPressed(){
        //  finish();
        Intent i= new Intent(cilindro.this,volumenes.class);
        startActivity(i);
    }
}
