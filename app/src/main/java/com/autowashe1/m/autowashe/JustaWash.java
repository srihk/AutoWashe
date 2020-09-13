package com.autowashe1.m.autowashe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class JustaWash extends AppCompatActivity
{

    Button cart;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_justa_wash);
        cart=findViewById(R.id.cart1suv);
        final String item="Just a Wash";
        final String price="₹190";
         cart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(),"Item added",Toast.LENGTH_LONG).show();
                // mDatabase.child(firebaseAuth.getUid()).child("Cupcake").child(item).setValue(price);
                Intent intent=new Intent(JustaWash.this,trail.class);
                intent.putExtra("item1",item);
                intent.putExtra("price1",price);

                startActivity(intent);
            }
        });
    }
}
