package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class SignUp extends AppCompatActivity {
   Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Objects.requireNonNull(getSupportActionBar()).hide();
        register = findViewById(R.id.SignUpregister);

        register.setOnClickListener(v -> {
            Log.d("OnClick","Here");
            // Perform action on clicks
            Toast.makeText(getApplicationContext(), "ClickOn Register", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignUp.this, MainActivity.class);
            startActivity(intent);


        });
    }
}