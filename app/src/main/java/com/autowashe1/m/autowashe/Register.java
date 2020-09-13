package com.autowashe1.m.autowashe;

import android.content.Intent;
import android.support.annotation.IntRange;
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
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity
{
    EditText email,pass;
    Button submit;
    FirebaseAuth firebaseAuth;
    EditText name,mobile;
    FirebaseFirestore firebaseFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email =findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        name=findViewById(R.id.name123);
        mobile=findViewById(R.id.mobile123);
        submit=findViewById(R.id.submit);
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseFirestore=FirebaseFirestore.getInstance();
        submit.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View view)
            {
                String Email=email.getText().toString();
                String Pass=pass.getText().toString();
                String Name=name.getText().toString();
                String Mobile=mobile.getText().toString();
                final Map<String,Object> data=new HashMap<>();
                data.put("UserName",Name);
                data.put("Mobile",Mobile);
                firebaseAuth.createUserWithEmailAndPassword(Email,Pass).addOnCompleteListener(new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        firebaseFirestore.collection("UserData").add(data).addOnCompleteListener(new OnCompleteListener<DocumentReference>()
                        {
                            @Override
                            public void onComplete(@NonNull Task<DocumentReference> task)
                            {

                                if(task.isSuccessful())
                                {
                                    Toast.makeText(getApplicationContext(),"SIGN UP DONE",Toast.LENGTH_LONG).show();
                                    Intent intent = new Intent(Register.this,MainActivity.class);
                                    startActivity(intent);
                                }
                                else
                                {
                                    Toast.makeText(getApplicationContext(),"SIGN UP FAILED",Toast.LENGTH_LONG).show();
                                }
                            }
                        });

                    }
                });

            }
        });


    }
}
