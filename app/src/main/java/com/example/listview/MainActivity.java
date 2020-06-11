package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView titulo;
    private ListView listView;

    private String opciones[]={"AREAS","VOLUMENES","OPERACIONES REALIZADAS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo=(TextView) findViewById(R.id.lblTituloListView);
        listView=(ListView) findViewById(R.id.lvPantalla1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,opciones);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
                if(listView.getItemAtPosition(position).equals(getString(R.string.areasTitulo))){
                    Intent intent;
                    intent= new Intent(MainActivity.this, Areas.class);
                    startActivity(intent);
                    finish();
                }
                if(listView.getItemAtPosition(position).equals(getString(R.string.tituloVolumenes))){
                    Intent intent;
                    intent= new Intent(MainActivity.this, volumenes.class);
                    startActivity(intent);
                    finish();
                }
                if(listView.getItemAtPosition(position).equals(getString(R.string.operacionesRealizadas))){
                    Intent intent;
                    intent= new Intent(MainActivity.this, realizadas.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
