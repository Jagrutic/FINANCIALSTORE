package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetFingerprint extends AppCompatActivity {

    Button buttonp4;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setfingerprint);

        textView =(TextView)findViewById(R.id.textViewSkip);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SetFingerprint.this, Dashboard.class);
                startActivity(intent);
            }
        });

        buttonp4 = (Button) findViewById(R.id.proceedButton3);
        buttonp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProceedActivity4();
            }
        });
    }

    private void openProceedActivity4() {

        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}