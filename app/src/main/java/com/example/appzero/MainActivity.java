package com.example.appzero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button0,button1;
    private EditText emailId,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailId = findViewById(R.id.editEmailAddress);
        pass = findViewById(R.id.editTextTextPassword);


        button0= findViewById(R.id.submitButton);
        button1= findViewById(R.id.registerButton);

        Intent intentFromReg = getIntent();
        String emailAddress = intentFromReg.getStringExtra("EmailAdd");
        String Password = intentFromReg.getStringExtra("Password");


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEmailAddress = emailId.getText().toString();
                String userPassword = pass.getText().toString();
                if((userEmailAddress.equals(emailAddress)) && (userPassword.equals(Password))){
                    passToSuccess();
                }else{
                    Toast.makeText(MainActivity.this, "Entered Email/Password Incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passToRegister();
            }
        });

    }

    public void passToSuccess(){
        String userEmailAddress = emailId.getText().toString();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("EmailVar",userEmailAddress);
        Intent intentFromReg = getIntent();
        String firstName = intentFromReg.getStringExtra("firstName");
        String lastName = intentFromReg.getStringExtra("lastName");
        intent.putExtra("userFirstName",firstName);
        intent.putExtra("userLastName",lastName);
        startActivity(intent);
    }

    public void passToRegister(){
        Intent intent =  new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}
