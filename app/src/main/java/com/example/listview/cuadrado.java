package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cuadrado extends AppCompatActivity {
    private EditText lado;
    private TextView area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        lado= findViewById(R.id.txtValorLado);
        area= findViewById(R.id.lblAreaCuadradoValor);
    }
    public void calcular(View v){
       int l,ar;
        if(validar()) {
            l = Integer.parseInt(lado.getText().toString());
            ar = l * l;
            area.setText("" + ar);
        }
    }

    public boolean validar(){
        boolean vacio=true;

        String c1= lado.getText().toString();

        if(c1.isEmpty()){
            lado.setError("Ingrese el lado");
            vacio=false;
        }


        return vacio;
    }
    public void onBackPressed(){
        //  finish();
        Intent i= new Intent(cuadrado.this,Areas.class);
        startActivity(i);
    }
}
