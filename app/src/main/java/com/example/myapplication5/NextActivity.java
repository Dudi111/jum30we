package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    private TextView tvusername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        tvusername=findViewById(R.id.etUsername);
        Intent intent=getIntent();
        String userName = intent.getStringExtra("username");
        tvusername.setText(userName);

    }
}