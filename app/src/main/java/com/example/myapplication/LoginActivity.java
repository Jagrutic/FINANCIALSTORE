package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {

    Button buttonl1;

    EditText editTextt, editTextt2, editTextt3, editTextt4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextt = findViewById(R.id.editText);
        editTextt2 = findViewById(R.id.editTextView);
        editTextt3 = findViewById(R.id.editTextView3);
        editTextt4 = findViewById(R.id.editTextView4);

        editTextt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (editTextt.getText().toString().length() == 1) {
                    editTextt2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editTextt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (editTextt2.getText().toString().length() == 1) {
                    editTextt3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editTextt3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (editTextt3.getText().toString().length() == 1) {
                    editTextt4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        buttonl1= (Button) findViewById(R.id.loginButton2);
        buttonl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextt.getText().toString().length() != 0) {
                    if (editTextt2.getText().toString().length() != 0) {
                        if (editTextt3.getText().toString().length() != 0) {
                            if (editTextt4.getText().toString().length() != 0) {

                                openStartUsing();
                            }
                        }
                    }
                }
            }
        });
    }


    private void openStartUsing() {

        Intent intent = new Intent(this, StartUsing.class);
        startActivity(intent);
    }

}