package com.example.myapplication_banco_pichicha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parte2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte2);
    }
    public void siguiente(View view)
    {
        Intent sig = new Intent (Parte2.this,parte3.class);
        startActivities(new Intent[]{sig});

    }
    public void retroceder (View view)
    {
        Intent intent =new Intent(Parte2.this, MainActivity.class);
        startActivities(new Intent[]{intent});

    }
}