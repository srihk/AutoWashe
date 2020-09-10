package com.autowashe1.m.autowashe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class trail extends AppCompatActivity {
    Intent intent;
    TextView item,price;
    Button pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trail);
        item=findViewById(R.id.item);
        price=findViewById(R.id.cost);
        pay=(Button)findViewById(R.id.payment);
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

}
