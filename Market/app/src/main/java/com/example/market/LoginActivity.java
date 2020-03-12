package com.example.market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btnLogin(View view){
        //Toast.makeText(this, "You have pressed login button", Toast.LENGTH_SHORT).show();
        Intent actHome = new Intent(this, HomeActivity.class); //Intent moverme entre actividades
        startActivity(actHome);
    }
    public void btnSignup(View view){
        //Toast.makeText(this, "You have pressed sign up button", Toast.LENGTH_SHORT).show();
        Intent actRegister = new Intent(this, RegisterActivity.class); //Intent moverme entre actividades
        startActivity(actRegister);

    }

}
