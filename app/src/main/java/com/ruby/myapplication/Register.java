package com.ruby.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

         final EditText fullname = findViewById(R.id.fullname);
         final EditText phone = findViewById(R.id.phone);
         final EditText email = findViewById(R.id.email);
         final EditText password = findViewById(R.id.password);
         final Button registerBtn = findViewById(R.id.registerBtn);
         final TextView loginNowBtn = findViewById(R.id.loginNow);

         final TextView loginError = findViewById(R.id.login_error);

        registerBtn.setOnClickListener(view -> {
            final String fullnameTxt = fullname.getText().toString();
            final String phoneTxt = phone.getText().toString();
            final String emailTxt = email.getText().toString();
            final String passwordTxt = password.getText().toString();


            if(
                    fullnameTxt.trim().isEmpty() ||
                    phoneTxt.trim().isEmpty() ||
                    emailTxt.trim().isEmpty() ||
                    passwordTxt.trim().isEmpty()
            ){
                loginError.setVisibility(View.VISIBLE);
                return;
            }
            //TODO: Logear al usuario
            startActivity(new Intent(Register.this, SplashScreen.class));
        });

        loginNowBtn.setOnClickListener(view -> {
            finish();
        });
    }
}