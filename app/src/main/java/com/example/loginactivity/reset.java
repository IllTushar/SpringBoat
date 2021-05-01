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

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class reset extends AppCompatActivity {
Button resetpass;
EditText newemail;
private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);
        resetpass =(Button)findViewById(R.id.newpass);
        newemail = (EditText) findViewById(R.id.lastemail);
        mAuth = FirebaseAuth.getInstance();
        resetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = newemail.getText().toString().trim();
                if (TextUtils.isEmpty(email)){
                    Toast.makeText(reset.this,"enter your email !!",Toast.LENGTH_SHORT).show();
                }
                else {
                    mAuth.sendPasswordResetEmail(email)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()){
                                        Toast.makeText(reset.this,"Check your email !!",Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(reset.this,Loginportal.class);
                                        startActivity(intent);
                                    }
                                    else {
                                        Toast.makeText(reset.this,"Reset password failed !!",Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });
    }
}