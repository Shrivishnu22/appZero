package com.example.appzero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button= findViewById(R.id.registerButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
    }
    public void sendData(){
        EditText emailET = findViewById(R.id.editTextEmailID);
        EditText passwordET = findViewById(R.id.editTextPassword);
        EditText fNameET = findViewById(R.id.editTextFirstName);
        EditText lNameET = findViewById(R.id.editTextLastName);

        String emailAdd = emailET.getText().toString();
        String password = passwordET.getText().toString();
        String fName = fNameET.getText().toString();
        String lName = lNameET.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("EmailAdd",emailAdd);
        intent.putExtra("Password",password);
        intent.putExtra("firstName",fName);
        intent.putExtra("lastName",lName);

        startActivity(intent);
    }
}