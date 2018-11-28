package de.ahmadiyya.waqf_e_nau;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class NisabFragment extends Fragment {

    View myView;
    Button button7, button8, button9, button10, button11, button12, button13, button14, button15;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.nisab_layout, container, false);


        button7 = (Button) myView.findViewById(R.id.btn7);
        button8 = (Button) myView.findViewById(R.id.btn8);
        button9 = (Button) myView.findViewById(R.id.btn9);
        button10 = (Button) myView.findViewById(R.id.btn10);
        button11 = (Button) myView.findViewById(R.id.btn11);
        button12 = (Button) myView.findViewById(R.id.btn12);
        button13 = (Button) myView.findViewById(R.id.btn13);
        button14 = (Button) myView.findViewById(R.id.btn14);
        button15 = (Button) myView.findViewById(R.id.btn15);

        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), VFlipper.class);
                myIntent.putExtra("button", "7");
                getActivity().startActivity(myIntent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), VFlipper.class);
                myIntent.putExtra("button", "8");
                getActivity().startActivity(myIntent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), VFlipper.class);
                myIntent.putExtra("button", "9");
                getActivity().startActivity(myIntent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), VFlipper.class);
                myIntent.putExtra("button", "10");
                getActivity().startActivity(myIntent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), VFlipper.class);
                myIntent.putExtra("button", "11");
                getActivity().startActivity(myIntent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), VFlipper.class);
                myIntent.putExtra("button", "12");
                getActivity().startActivity(myIntent);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), VFlipper.class);
                myIntent.putExtra("button", "13");
                getActivity().startActivity(myIntent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), VFlipper.class);
                myIntent.putExtra("button", "14");
                getActivity().startActivity(myIntent);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), VFlipper.class);
                myIntent.putExtra("button", "15");
                getActivity().startActivity(myIntent);
            }
        });


        return myView;
    }
}
