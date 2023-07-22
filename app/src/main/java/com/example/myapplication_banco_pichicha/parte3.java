package com.example.myapplication_banco_pichicha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parte3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte3);
    }
    public void siguiente(View view)
    {
        Intent sig = new Intent (parte3.this,Parte2.class);
        startActivities(new Intent[]{sig});

    }
    public void retroceder (View view)
    {
        Intent intent =new Intent(parte3.this,MainActivity.class);
        startActivities(new Intent[]{intent});

    }
}