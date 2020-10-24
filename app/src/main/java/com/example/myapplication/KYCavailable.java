package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KYCavailable extends AppCompatActivity {

    Button buttonp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kycavailable);

        buttonp6= (Button)findViewById(R.id.proceedButton6);
        buttonp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStartUsing();
            }
        });
    }

    private void openStartUsing() {
        Intent intent = new Intent(this, StartUsing.class);
        startActivity(intent);
    }
}