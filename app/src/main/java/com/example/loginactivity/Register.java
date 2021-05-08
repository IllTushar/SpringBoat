package com.example.loginactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class Register extends AppCompatActivity {
Button login,Register,search;
private FirebaseAuth mAuth;
private EditText username,emails,password,confermpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        username = (EditText)findViewById(R.id.user);
        emails = (EditText)findViewById(R.id.gmail);
        password = (EditText)findViewById(R.id.password);
        confermpassword = (EditText)findViewById(R.id.confpassword);
        Register = (Button)findViewById(R.id.res);
        login = (Button)findViewById(R.id.log);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String musername = username.getText().toString().trim();
              String memail = emails.getText().toString().trim();
              String mpassword = password.getText().toString().trim();
              String mconfermpassword = confermpassword.getText().toString().trim();
              if (TextUtils.isEmpty(musername)){
                  Toast.makeText(Register.this,"Please Enter Username !!",Toast.LENGTH_SHORT).show();
                  return;
              }
              if (TextUtils.isEmpty(memail)){
                  Toast.makeText(Register.this,"Please Enter Email !!",Toast.LENGTH_SHORT).show();
                  return;
              }
              if (TextUtils.isEmpty(mpassword)){
                  Toast.makeText(Register.this,"Please Enter Password !!",Toast.LENGTH_SHORT).show();
                  return;
              }
              if (TextUtils.isEmpty(mconfermpassword)){
                  Toast.makeText(Register.this,"Please Enter ConfirmPassword",Toast.LENGTH_SHORT).show();
                  return;
              }
              if (mpassword.length()<6){
                  Toast.makeText(Register.this,"Password is too Short",Toast.LENGTH_SHORT).show();
                  return;
              }
              if (mpassword.equals(mconfermpassword)){
                  mAuth.createUserWithEmailAndPassword(memail,mconfermpassword)
                          .addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                              @Override
                              public void onComplete(@NonNull Task<AuthResult> task) {
                                  if (task.isSuccessful()) {
                                  Intent i = new Intent(Register.this,songandvideo.class);
                                  startActivity(i);
                                  Toast.makeText(Register.this,"Register SuccessFull",Toast.LENGTH_SHORT).show();
                                  } else {
                                    Toast.makeText(Register.this,"Register Failed",Toast.LENGTH_SHORT).show();
                                  }
                              }
                          });
              }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register.this,Loginportal.class);
                startActivity(i);
                finish();
            }
        });
    }
}