package com.example.healthcare;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {
    EditText edUsername, edPassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

edUsername = findViewById(R.id.editTextloginusername);
        edPassword = findViewById(R.id.editTextloginpassword);
        btn = findViewById(R.id.buttonlogin);
        tv = findViewById(R.id.textViewNewUser);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = edUsername.getText().toString();
                String password = edPassword.getText().toString();
                Database db = new Database(getApplicationContext(),"healthcare",null , 1);

                int result=db.Login(username,password);
                Toast.makeText(getApplicationContext(), "login Success"+result, Toast.LENGTH_SHORT).show();

                if (username.length() == 0 || password.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Pleas fill All Details  ", Toast.LENGTH_SHORT).show();
                } else {
                    if (result==1){
                        Toast.makeText(getApplicationContext(), "login Success", Toast.LENGTH_SHORT).show();
                        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs" , Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor= sharedPreferences.edit();
                        editor.putString("username", username);
                        // to save our data with key and value .
                        editor.apply();
                        startActivity(new Intent(loginActivity.this,HomeActivity.class));
                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid Username or password"+result, Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               startActivity(new Intent(loginActivity.this ,
                       RegisterActivity.class));
            }

        });
    }
}
