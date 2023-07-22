package com.example.myapplication_banco_pichicha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void siguiente(View view)
    {
        Intent sig = new Intent (MainActivity.this,Parte2.class);
        startActivities(new Intent[]{sig});

    }
    public void retroceder (View view)
    {
        Intent intent =new Intent(MainActivity.this,parte3.class);
        startActivities(new Intent[]{intent});

    }
}
