package com.example.verbosetech.fooddude.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.verbosetech.fooddude.R;

/**
 * Created by sagar on 29/6/17.
 */

public class ProcessOrdersFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.process_layout,container,false);
        return view;
    }
}