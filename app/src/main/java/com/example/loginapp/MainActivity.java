package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
   Button login,Register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // to remove tollbar
        Objects.requireNonNull(getSupportActionBar()).hide();
        login = findViewById(R.id.Battonlogin);
        Register = findViewById(R.id.register);
        login.setOnClickListener(v -> {
            Log.d("OnClick","Here");
            // Perform action on clicks
            Toast.makeText(getApplicationContext(), "Click Login", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SignIn_Actvivity.class);
            startActivity(intent);


        });

        Register.setOnClickListener(v -> {
            Log.d("OnClick","Here");
            // Perform action on clicks
            Toast.makeText(getApplicationContext(), "Click Register", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SignUp.class);
            startActivity(intent);


        });




    }
}