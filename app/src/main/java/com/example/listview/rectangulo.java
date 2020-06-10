package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class rectangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
    }
    public void onBackPressed(){
        //  finish();
        Intent i= new Intent(rectangulo.this,Areas.class);
        startActivity(i);
    }
}
