package com.example.myapplication.ui.transaction;



import android.content.Intent;
import android.os.Bundle;


import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.example.myapplication.R;
import com.example.myapplication.Purchase;
import com.example.myapplication.Redemption;
import com.example.myapplication.StpSwp;
import com.example.myapplication.Switch;


public class TransactionFragment extends Fragment {

    Button b1,b2,b3,b4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_transaction, container, false);

        b1=v.findViewById(R.id.button1);
        b2=v.findViewById(R.id.button2);
        b3=v.findViewById(R.id.button3);
        b4=v.findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), Purchase.class));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), Redemption.class));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), Switch.class));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), StpSwp.class));
            }
        });

        return  v;
    }
}