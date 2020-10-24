package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    Button buttonp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        buttonp5 = (Button) findViewById(R.id.proceedButton4);
        buttonp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProceedActivity5();
            }
        });
    }

    private void openProceedActivity5() {

        Intent intent = new Intent(this, StartKYC.class);
        startActivity(intent);
    }
}