package com.autowashe1.m.autowashe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Tab3Truck  extends Fragment {
    ImageView truck1,truck2,truck3,truck4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.truck_layout, container, false);
        truck1=rootView.findViewById(R.id.truck1);
        truck2=rootView.findViewById(R.id.truck2);
        truck3=rootView.findViewById(R.id.truck3);
        truck4=rootView.findViewById(R.id.truck4);

        truck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),JustaWashTruck.class);
                startActivity(intent);

            }
        });
        truck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),SpecialWashTruck.class);
                startActivity(intent);

            }
        });
        truck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),WashandShineTruck.class);
                startActivity(intent);

            }
        });
        truck4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(),AwesomeWashTruck.class);
                startActivity(intent);

            }
        });
        return rootView;
    }
}
