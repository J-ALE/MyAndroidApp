package com.ruby.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         final EditText email = findViewById(R.id.email);
         final EditText password = findViewById(R.id.password);
         final Button loginBtn = findViewById(R.id.loginBtn);
         final TextView registerNow = findViewById(R.id.registerNowBtn);
         final TextView login_error = findViewById(R.id.login_error);

        loginBtn.setOnClickListener(view -> {
            final String emailTxt = email.getText().toString();
            final String passwordTxt = password.getText().toString();

            if(emailTxt.trim().isEmpty() || passwordTxt.trim().isEmpty()) {
                login_error.setVisibility(View.VISIBLE);
                return;
            }
            //TODO:Validar usuario en la BD

            startActivity(new Intent(Login.this, SplashScreen.class));
        });

        registerNow.setOnClickListener(view -> {

            startActivity(new Intent(Login.this, Register.class));
            login_error.setVisibility(View.GONE);
            email.setText("");
            password.setText("");
        });
    }
}