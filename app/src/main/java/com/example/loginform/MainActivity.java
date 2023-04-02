package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton button = (MaterialButton) findViewById(R.id.login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                    //successfull login
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();

                    Intent goToDashboard = new Intent(MainActivity.this,fragments.class);
                    goToDashboard.putExtra("KEY_USERNAME",username.getText().toString());

                    startActivity(goToDashboard);
                    finish();
                }else {
                    Toast.makeText(MainActivity.this, "LOGIN FAILED!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}