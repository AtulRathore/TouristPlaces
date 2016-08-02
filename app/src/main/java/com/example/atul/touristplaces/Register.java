package com.example.atul.touristplaces;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Atul on 03-08-2016.
 */
public class Register extends AppCompatActivity {

   Button btnLinkToLoginScreen;
    @Override
    protected void onCreate(Bundle S){
        super.onCreate(S);
        setContentView(R.layout.register);
        btnLinkToLoginScreen = (Button) findViewById(R.id.btnLinkToLoginScreen);
        btnLinkToLoginScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Register.this, MainActivity.class);
                startActivity(i1);
                finish();
            }
        });
    }
}
