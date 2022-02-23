package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements Communicator{


    FragmentB fragmentB;
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();

        if (savedInstanceState == null){

            fragmentB = new FragmentB();
            fm.beginTransaction().replace(R.id.frame2,fragmentB,"FragB").commit();
        }
        else {
            fragmentB = (FragmentB) fm.findFragmentByTag("FragB");
        }
    }

    @Override
    public void respond(int i) {
         fragmentB.change(i);
    }
}