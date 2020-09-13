package com.autowashe1.m.autowashe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddToCart extends AppCompatActivity {

    Toolbar toolbar;
    Intent intent;
    TextView item,price;
    Button pay;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        item=findViewById(R.id.itemcart);
        price=findViewById(R.id.costcart);
        pay=(Button)findViewById(R.id.paymentcart);

        getSupportActionBar().setTitle("Add to cart");
        intent=getIntent();
        Bundle bundle= intent.getExtras();
        String Item=bundle.getString("item1");
        String Price=bundle.getString("price1");

        item.setText(Item);
        price.setText(Price);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://paytm.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);

        int id=item.getItemId();
        if(id==R.id.cart)
        {
            Toast.makeText(getApplicationContext(),"OK",Toast.LENGTH_LONG).show();
        }
        return true;

    }
}
