package com.example.a124190054_uas_altrariqwelfareyubaidi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(MainActivity.this, formOpening.class);
        startActivity(i);
    }

    public void clickForm(View view) {
        Intent i = new Intent(MainActivity.this, formOpening.class);
        startActivity(i);
    }
}