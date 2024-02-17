package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnfrag1,btnfrag2,btnfrag3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfrag1 =findViewById(R.id.btnFrag1);
        btnfrag2 =findViewById(R.id.btnFrag2);
        btnfrag3 =findViewById(R.id.btnFrag3);

        //ab me ye chahta hu ki jb activity load ho to by default koi ek fragment to on rhe
        //to on create me pehle hi direct hi ek bar kisi bhi frgment ko load krva deta hu

        loadFrag(new Fragment_2(),0);
        btnfrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new Fragment1(),1);


            }
        });

        btnfrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new Fragment_2(),1);


            }
        });

        btnfrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFrag(new Fragment3(),1);

            }
        });



    }
    public void loadFrag(Fragment fragment,int flag){
        // yaha pr mujhe har ek framengt k liye alg se parameter pass ki h

        FragmentManager fm =getSupportFragmentManager(); //ye ek  internaal call h yani service h to hum ise get k through lete h
        FragmentTransaction ft =fm.beginTransaction();
        //ab yaha mujhe add or remove bhi ot dekhna h to me yaha pr if else lga tha hu koi ek flag value lekr
        if(flag ==0){
            ft.add(R.id.container,fragment);
        }else{
            ft.replace(R.id.container,fragment);
        }
        ft.commit();
    }
}
