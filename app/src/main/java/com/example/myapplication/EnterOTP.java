package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterOTP extends AppCompatActivity {

    Button buttonp2;
    EditText editText,editText2,editText3,editText4,editText5,editText6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterotp);

        editText=findViewById(R.id.editTextView);
        editText2=findViewById(R.id.editTextView2);
        editText3=findViewById(R.id.editTextView3);
        editText4=findViewById(R.id.editTextView4);
        editText5=findViewById(R.id.editTextView5);
        editText6=findViewById(R.id.editTextView6);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editText.getText().toString().length()==1){
                    editText2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editText2.getText().toString().length()==1){
                    editText3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editText3.getText().toString().length()==1){
                    editText4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editText4.getText().toString().length()==1){
                    editText5.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editText5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editText5.getText().toString().length()==1){
                    editText6.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        buttonp2 = (Button) findViewById(R.id.proceedButton3);
        buttonp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().length() != 0) {
                    if (editText2.getText().toString().length() != 0) {
                        if (editText3.getText().toString().length() != 0) {
                            if (editText4.getText().toString().length() != 0) {
                                if (editText5.getText().toString().length() != 0) {
                                    if (editText6.getText().toString().length() != 0) {

                                        openSetOTP();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });

    }

    private void openSetOTP() {

        Intent intent = new Intent(this, PAN.class);
        startActivity(intent);
    }

}