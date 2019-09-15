package com.example.preman.fisikakubusbalok.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.preman.fisikakubusbalok.R;

public class GambarFragment extends Fragment {

    public GambarFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gambar, container, false);
    }
}
