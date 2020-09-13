package com.autowashe1.m.autowashe;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class
Tab1Sedan extends Fragment{
    ImageView sedan1,sedan2,sedan3,sedan4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sedan_layout, container, false);
        sedan1=rootView.findViewById(R.id.sedan1);
        sedan2=rootView.findViewById(R.id.sedan2);
        sedan3=rootView.findViewById(R.id.sedan3);
        sedan4=rootView.findViewById(R.id.sedan4);

        sedan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),JustawashSedan.class);
                startActivity(intent);

            }
        });
        sedan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),SpecialwashSedan.class);
                startActivity(intent);

            }
        });
        sedan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),WashAndShineSedan.class);
                startActivity(intent);

            }
        });
        sedan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),AwesomeWashSedan.class);
                startActivity(intent);

            }
        });
        return rootView;
    }

}
