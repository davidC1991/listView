package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class volumenes extends AppCompatActivity {
    private TextView tituloVolumen;
    private ListView lvVolumen;
    private String volumenes[]={"ESFERA","CILINDRO","CONO","CUBO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes);
        tituloVolumen=(TextView) findViewById(R.id.lblTituloVolumenes);
        lvVolumen=(ListView) findViewById(R.id.lvVolumenes);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,volumenes);
        lvVolumen.setAdapter(adapter);

        lvVolumen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(lvVolumen.getItemAtPosition(position).equals("ESFERA")){
                    Intent intent;
                    intent= new Intent(volumenes.this, esfera.class);
                    startActivity(intent);
                    finish();
                }
                if(lvVolumen.getItemAtPosition(position).equals("CONO")){
                    Intent intent;
                    intent= new Intent(volumenes.this, cono.class);
                    startActivity(intent);
                    finish();
                }
                if(lvVolumen.getItemAtPosition(position).equals("CILINDRO")){
                    Intent intent;
                    intent= new Intent(volumenes.this, cilindro.class);
                    startActivity(intent);
                    finish();
                }
                if(lvVolumen.getItemAtPosition(position).equals("CUBO")){
                    Intent intent;
                    intent= new Intent(volumenes.this, cubo.class);
                    startActivity(intent);
                    finish();
                }

            }
        });


    }

    public void onBackPressed(){
        //  finish();
        Intent i= new Intent(volumenes.this,MainActivity.class);
        startActivity(i);
    }
}
