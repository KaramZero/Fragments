package com.example.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class FragmentB extends Fragment {

    View view ;
    String data=" ";
    TextView textView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        if (savedInstanceState != null){
            data=savedInstanceState.getString("Data");
        }

        view = inflater.inflate(R.layout.fragment_b, container, false);
        textView = view.findViewById(R.id.counter);
        textView.setText(data);
        return view;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Data",textView.getText().toString());
    }

    public void change(int i){

        String s= ""+i;

        if (textView != null)
        textView.setText(s);

    }

}


interface Communicator{
     void respond(int i);
}