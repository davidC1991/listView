package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class circulo extends AppCompatActivity {
    private EditText radio;
    private TextView area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        radio= findViewById(R.id.txtValorRadioCirculo);
        area= findViewById(R.id.lblAreaValorCirculo);
    }
    public void calcularCirculo(View v){
        int r,ar;
        if(validar1()) {
            r = Integer.parseInt(radio.getText().toString());
            ar = (int) 3.14 * r * r;
            area.setText("" + ar);
        }
    }

    public boolean validar1(){
        boolean vacio=true;

        String c1= radio.getText().toString();

        if(c1.isEmpty()){
            radio.setError("Ingrese el radio");
            vacio=false;
        }


        return vacio;
    }
    public void onBackPressed(){
        //  finish();
        Intent i= new Intent(circulo.this,Areas.class);
        startActivity(i);
    }
}
