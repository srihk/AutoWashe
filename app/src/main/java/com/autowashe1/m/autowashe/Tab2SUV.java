package com.autowashe1.m.autowashe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class Tab2SUV  extends Fragment
{
    ImageView cart1suv,cart2suv,cart3suv,cart4suv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.suv_layout, container, false);
        cart1suv=rootView.findViewById(R.id.suv1);
        cart2suv=rootView.findViewById(R.id.suv2);
        cart3suv=rootView.findViewById(R.id.suv3);
        cart4suv=rootView.findViewById(R.id.suv4);

        cart1suv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),JustaWash.class);
                startActivity(intent);

            }
        });
        cart2suv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),SpecialWash.class);
                startActivity(intent);

            }
        });
        cart3suv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),WashAndShine.class);
                startActivity(intent);

            }
        });
        cart4suv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),AwesomeWash.class);
                startActivity(intent);

            }
        });



        return rootView;
    }



}
