package com.example.a124190054_uas_altrariqwelfareyubaidi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class formOpening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_opening);
    }

    public void clickOpening(View view) {
        Intent i = new Intent(formOpening.this, layoutPerkenalan.class);
        startActivity(i);
    }
}