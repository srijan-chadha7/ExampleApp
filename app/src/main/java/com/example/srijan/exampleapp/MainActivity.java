package com.example.srijan.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void login(View view){


        EditText usernameEditText=findViewById(R.id.usernameEditText);
        EditText passwordEditText=findViewById(R.id.passwordEditText);

        Log.i("Info","Button pressed!");
        Log.i("Username",usernameEditText.getText().toString());
        Log.i("Password",passwordEditText.getText().toString());

    }


    public void clickfun(View view){
        Log.i("Info","Button pressed!!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
