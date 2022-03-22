package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class SignIn_Actvivity extends AppCompatActivity {
     Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_actvivity);
        login = findViewById(R.id.Battonlogin);



        login.setOnClickListener(v -> {
            Log.d("OnClick","Here");
            // Perform action on clicks
            Toast.makeText(getApplicationContext(), "ClickOn Sign in", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignIn_Actvivity.this, MainActivity.class);
            startActivity(intent);


        });
    }
}