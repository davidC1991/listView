package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Areas extends AppCompatActivity {
    private TextView tituloAreas;
    private ListView lvAreas;
    private String areas[]={"CUADRADO","RECTANGULO","TRIANGULO","CIRCULO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);

        tituloAreas=(TextView) findViewById(R.id.lblTituloAreas);
        lvAreas=(ListView) findViewById(R.id.lvPantallaAreas);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,areas);
        lvAreas.setAdapter(adapter);

        lvAreas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(lvAreas.getItemAtPosition(position).equals("CUADRADO")){
                    Intent intent;
                    intent= new Intent(Areas.this, cuadrado.class);
                    startActivity(intent);
                    finish();
                }
                if(lvAreas.getItemAtPosition(position).equals("TRIANGULO")){
                    Intent intent;
                    intent= new Intent(Areas.this, triangulo.class);
                    startActivity(intent);
                    finish();
                }
                if(lvAreas.getItemAtPosition(position).equals("RECTANGULO")){
                    Intent intent;
                    intent= new Intent(Areas.this, rectangulo.class);
                    startActivity(intent);
                    finish();
                }
                if(lvAreas.getItemAtPosition(position).equals("CIRCULO")){
                    Intent intent;
                    intent= new Intent(Areas.this, circulo.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }

    public void onBackPressed(){
        //  finish();
        Intent i= new Intent(Areas.this,MainActivity.class);
        startActivity(i);
    }
}
