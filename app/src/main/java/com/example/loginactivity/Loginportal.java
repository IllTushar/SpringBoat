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

import java.io.FileFilter;

public class Loginportal extends AppCompatActivity {
private FirebaseAuth mAuth;
Button Login,btnreset;
private EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginportal);
        Login =(Button)findViewById(R.id.signUp);
        email= (EditText)findViewById(R.id.logemail);
        password = (EditText)findViewById(R.id.confpassword);
        mAuth = FirebaseAuth.getInstance();
        btnreset = (Button)findViewById(R.id.btnreset);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Loginportal.this,reset.class);
                startActivity(p);
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String memail = email.getText().toString().trim();
                String mpassword = password.getText().toString().trim();

                if (TextUtils.isEmpty(memail)){
                    Toast.makeText(Loginportal.this,"Enter Email !!",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(mpassword)){
                    Toast.makeText(Loginportal.this,"Enter Password !!",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (mpassword.length()<6){
                    Toast.makeText(Loginportal.this,"Length of password too short",Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.signInWithEmailAndPassword(memail,mpassword)
                        .addOnCompleteListener(Loginportal.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(Loginportal.this,"SignIn Successfull !!",Toast.LENGTH_SHORT).show();
                                    Intent i = new Intent(Loginportal.this,songandvideo.class);
                                    startActivity(i);

                                } else {
                                    Toast.makeText(Loginportal.this,"SignIn Failed !!",Toast.LENGTH_SHORT).show();
                                    return;
                                }
                            }
                        });
            }
        });
    }
}