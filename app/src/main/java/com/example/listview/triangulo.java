package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class triangulo extends AppCompatActivity {
    private EditText base;
    private EditText altura;
    private TextView area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        base= findViewById(R.id.txtValorBaseTriangulo);
        altura= findViewById(R.id.txtValorAlturaTriangulo);
        area= findViewById(R.id.lblAreaTrianguloValor);
    }
    public void calcularTriangulo(View v){
        int b,h,ar;
        if(validar1()) {
            b = Integer.parseInt(base.getText().toString());
            h = Integer.parseInt(altura.getText().toString());
            ar = (b * h)/2;
            area.setText("" + ar);
        }
    }

    public boolean validar1(){
        boolean vacio=true;

        String c1= base.getText().toString();
        String c2= altura.getText().toString();

        if(c1.isEmpty()){
            base.setError("Ingrese la base");
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
        Intent i= new Intent(triangulo.this,Areas.class);
        startActivity(i);
    }
}
