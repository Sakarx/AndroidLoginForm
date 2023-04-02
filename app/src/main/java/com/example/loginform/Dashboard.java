package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView welcome = findViewById(R.id.welcome);

        Intent dashboardIntent = getIntent();
        String recievedValue = dashboardIntent.getStringExtra("KEY_USERNAME");
        welcome.setText("Welcome, "+recievedValue);
    }
}