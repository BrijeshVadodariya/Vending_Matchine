package com.example.puff_soda;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    TextView MyTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyTextview = findViewById(R.id.textview);
        Intent intent = getIntent();

        String value = intent.getStringExtra("value");
        MyTextview.setText(value);
    }


}