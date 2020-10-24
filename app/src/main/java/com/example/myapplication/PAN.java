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


public class PAN extends AppCompatActivity {

    private static final String TAG ="PAN" ;
    EditText editTextPAN;
    Button buttonp3;
    public static final String KEY_PAN="PANNumber";

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan);

        editTextPAN = (EditText) findViewById(R.id.editTextView);


        buttonp3 = (Button) findViewById(R.id.proceedButton3);
        buttonp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PANNumber=editTextPAN.getText().toString().trim();

                Map<String, Object> user = new HashMap<>();
                user.put(KEY_PAN, PANNumber);

                db.collection("Users")
                        .document("Info")
                        .set(user)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {

                                Toast.makeText(PAN.this, "Success", Toast.LENGTH_SHORT).show();

                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                                Log.d(TAG,"OnFailure "+ e.toString());

                            }
                        });

                    openSetFingerprint();

            }

        });

    }

    private void openSetFingerprint () {
            Intent intent = new Intent(this, SetFingerprint.class);
            startActivity(intent);
        }
}
