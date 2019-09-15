package com.example.preman.fisikakubusbalok.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.preman.fisikakubusbalok.DetaiActivity;
import com.example.preman.fisikakubusbalok.DetailActivity;
import com.example.preman.fisikakubusbalok.R;

public class VideoFragment extends Fragment {


    public VideoFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video, container, false);

        Button btn1 = view.findViewById(R.id.btn1); // balok
        Button btn2 = view.findViewById(R.id.btn2); // kubus

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DetaiActivity.class);
                startActivity(intent);
            }
        });



        return view;
    }

}
