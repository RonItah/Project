package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText editTextTextPersonName;
    private EditText editTextTextEmailAddress;
    private EditText editTextTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
    }

    public void Clear_Name(View v) {
        editTextTextPersonName.setText("");
    }

    public void Clear_Email(View v) {
        editTextTextEmailAddress.setText("");
    }

    public void Clear_Password(View v) {
        editTextTextPassword.setText("");
    }

    public void Submit(View v) {
        Toast.makeText(this, "Login successful!!! " + "Username:" + String.valueOf(editTextTextPersonName.getText()) + "Email:" + String.valueOf(editTextTextEmailAddress.getText()) + " Password:" + String.valueOf(editTextTextPassword.getText()), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, CurrencyValues_activity.class);
        startActivity(intent);
    }
}