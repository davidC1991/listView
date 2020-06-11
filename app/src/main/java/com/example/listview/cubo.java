package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cubo extends AppCompatActivity {
    private EditText lado;
    private TextView cubo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);

        lado= findViewById(R.id.txtValorLadoCubo);
        cubo= findViewById(R.id.lblVolumenCuboValor);
    }
    public void calcularCubo(View v){
        int l,ar;
        if(validar()) {
            l = Integer.parseInt(lado.getText().toString());
            ar = l * l * l;
            cubo.setText("" + ar);
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
        Intent i= new Intent(cubo.this,volumenes.class);
        startActivity(i);
    }
}
