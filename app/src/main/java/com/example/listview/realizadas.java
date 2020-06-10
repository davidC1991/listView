package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class realizadas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizadas);
    }

    public void onBackPressed(){
        //  finish();
        Intent i= new Intent(realizadas.this,MainActivity.class);
        startActivity(i);
    }
}
