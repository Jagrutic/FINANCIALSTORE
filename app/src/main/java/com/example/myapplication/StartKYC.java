package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartKYC extends AppCompatActivity {

    Button buttonp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startkyc);

        buttonp6 = (Button) findViewById(R.id.proceedButton5);
        buttonp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProceedActivity6();
            }
        });
    }

    private void openProceedActivity6() {

        Intent intent = new Intent(this, KYCavailable.class);
        startActivity(intent);
    }
}