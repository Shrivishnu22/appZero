package com.example.appzero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView emailTV = findViewById(R.id.EmailVar);
        Intent intentFromMain = getIntent();
        String emailAdd = intentFromMain.getStringExtra("EmailVar");
        emailTV.setText("You have signed as "+emailAdd);

        TextView messageTV = findViewById(R.id.welcomeMsg);
        String firstName = intentFromMain.getStringExtra("userFirstName");
        String lastName = intentFromMain.getStringExtra("userLastName");
        messageTV.setText("Hi "+firstName+" "+lastName+" !!!");
    }
}