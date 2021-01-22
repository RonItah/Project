package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

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

    public void Clear_Name(View v){
        editTextTextPersonName.setText("");
    }

    public void Clear_Email(View v){
        editTextTextEmailAddress.setText("");
    }

    public void Clear_Password(View v){
        editTextTextPassword.setText("");
    }

    public void Submit(View v){
        if (editTextTextPersonName.length() < 4 || editTextTextPersonName.length() > 13) {
            Toast.makeText(this,"Name must be longer than 4 characters and shorter than 13 characters",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, FuckU.class);
            startActivity(intent);
        }
        else
            if (editTextTextEmailAddress.length() < 8 || editTextTextEmailAddress.length() > 35){
                Toast.makeText(this,"Email must be longer than 4 characters and shorter than 35 characters",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, FuckU.class);
                startActivity(intent);
            }
            else
                if (editTextTextEmailAddress.toString().indexOf('@') == -1){
                    Toast.makeText(this,"Email must have a '@' in it",Toast.LENGTH_SHORT).show();
                }
                else
                    if (editTextTextEmailAddress.toString().indexOf('@') == 0 || editTextTextEmailAddress.toString().indexOf('@') == editTextTextEmailAddress.length()-1){
                        Toast.makeText(this,"Email can't have a '@' at the start or end of it",Toast.LENGTH_SHORT).show();
                    }
                    else
                        if(editTextTextEmailAddress.toString().indexOf('@') != editTextTextEmailAddress.toString().lastIndexOf('@')){
                            Toast.makeText(this,"Email can't have 2 '@'",Toast.LENGTH_SHORT).show();
                        }
                        else
                            if (editTextTextPassword.length() < 6 || editTextTextPassword.length() > 13){
                            Toast.makeText(this,"Password must be longer than 6 characters and shorter than 13 characters",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(this, FuckU.class);
                            startActivity(intent);
                            }
                            else
                                Toast.makeText(this, "You registered successfully!!! " + "Username:"+ String.valueOf(editTextTextPersonName.getText())+",Email:"+ String.valueOf(editTextTextEmailAddress.getText())+",Password:"+ String.valueOf(editTextTextPassword.getText()),Toast.LENGTH_SHORT).show();
    }

}