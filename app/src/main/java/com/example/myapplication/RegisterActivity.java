package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;



public class RegisterActivity extends AppCompatActivity {

    private static final String TAG = "RegisterActivity";
    private EditText editTextphone, editTextEmail, editTextpin1, editTextpin2;
    private Button buttonp;

    public static final String KEY_Phone="phoneNumber";
    public static final String KEY_Email="Email";
    public static final String KEY_PIN="PIN";


    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        buttonp = (Button) findViewById(R.id.proceedButton3);
        editTextphone = findViewById(R.id.editTextView);
        editTextEmail = findViewById(R.id.editTextView3);
        editTextpin1 = findViewById(R.id.pin1);
        editTextpin2 = findViewById(R.id.pin2);






        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phoneNumber=editTextphone.getText().toString().trim();
                String Email=editTextEmail.getText().toString().trim();
                String PIN=editTextpin1.getText().toString().trim();

                Map<String, Object> user = new HashMap<>();
                user.put(KEY_Phone, phoneNumber);
                user.put(KEY_Email, Email);
                user.put(KEY_PIN, PIN);

// Add a new document with a generated ID
                db.collection("Users")
                        .document("Info")
                        .set(user)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {

                                Toast.makeText(RegisterActivity.this, "Success", Toast.LENGTH_SHORT).show();

                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                                Log.d(TAG,"OnFailure "+ e.toString());

                            }
                        });

                if (editTextphone.getText().toString().length() != 0) {
                    if (editTextEmail.getText().toString().length() != 0) {
                        if (editTextpin1.getText().toString().length() != 0) {
                            if (editTextpin2.getText().toString().length() != 0) {

                                openEnterOTP();
                            }
                        }
                    }
                }

            }

        });


    }

    private void openEnterOTP() {

        Intent intent = new Intent(this, EnterOTP.class);
        startActivity(intent);

    }


}