package com.example.fragmentdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment1 extends Fragment {



    public Fragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view= inflater.inflate(R.layout.fragment_1, container, false);
//        view.findViewById(R.id.txtfragment); //aise krte h na to ab ise hi ek txtview mw le lengev
        TextView txtview=  view.findViewById(R.id.txtfragment);
        //ab hum yaha pr apne instruction set kr skte h


        return view;
        // Inflate the layout for this fragment
       // ye line jo h ki autonatc aati h to apne to or apne ko chahiye ko jaise textview chaiye to hum aise krte h na
        // TextView txtnam = findviewbyid kr k krte h na to bs pr yaha niche dekho to hum view return kr rhe h to apne ko use hi to lena h hum layout le rhe h ko return ko ek
        //jo inflat maehtd h vo voiw ka ref le ayerga or return le ayega to apne ko bs eeturn ko change kr k view class k varibe e hndle kr enge
        //isi liye upr niche vali line ka view use kia h
        // return inflater.inflate(R.layout.fragment_1, container, false);
        //jb humne use tod dia h to ab hum use alg se use bhi kr skte h

    }
}