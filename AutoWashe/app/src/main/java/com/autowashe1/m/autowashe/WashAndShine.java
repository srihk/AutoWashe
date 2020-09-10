package com.autowashe1.m.autowashe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WashAndShine extends AppCompatActivity {

    Button cart;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wash_and_shine);
        cart=findViewById(R.id.cart3suv);
        final String item="Wash and Shine";
        final String price="₹300";
        cart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(),"Added to cart",Toast.LENGTH_LONG).show();
                // mDatabase.child(firebaseAuth.getUid()).child("Cupcake").child(item).setValue(price);
                Intent intent=new Intent(WashAndShine.this,trail.class);
                intent.putExtra("item1",item);
                intent.putExtra("price1",price);

                startActivity(intent);
            }
        });
    }
}
