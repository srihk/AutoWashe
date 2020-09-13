package com.autowashe1.m.autowashe;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login2 extends AppCompatActivity
{
    EditText email1,pass1;
    Button submit1;
    FirebaseAuth firebaseAuth1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        email1 = findViewById(R.id.email1);
        pass1 = findViewById(R.id.pass1);
        submit1 = findViewById(R.id.submit1);
        firebaseAuth1= FirebaseAuth.getInstance();
        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String Email1 = email1.getText().toString();
                String Pass1 = pass1.getText().toString();
                Toast.makeText(getApplicationContext(),Email1,Toast.LENGTH_LONG).show();
                firebaseAuth1.signInWithEmailAndPassword(Email1,Pass1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(getApplicationContext(),"LOGIN DONE",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(Login2.this,MainActivity.class);
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"LOGIN FAILED",Toast.LENGTH_LONG).show();
                        }


                    }
                });

            }

        });

    }
}
