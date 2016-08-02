package com.example.atul.touristplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button button, btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.login);
        button.setOnClickListener(this);
        btnRegister= (Button) findViewById(R.id.toregister);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==button) {
            Toast.makeText(this, "Toast", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, MetroCitiies.class);
            startActivity(i);
            finish();
        }

        else if (view==btnRegister){
            Toast.makeText(MainActivity.this, "Register", Toast.LENGTH_SHORT).show();
            Intent i2= new Intent(this, Register.class);
            startActivity(i2);
            finish();
        }
    }
}
