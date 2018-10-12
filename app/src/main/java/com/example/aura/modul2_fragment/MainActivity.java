package com.example.aura.modul2_fragment;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

//    public void onShowDetails(View view) {
//        Intent intent = new Intent(this, DetailActivity.class);
//        startActivity(intent);
//    }

    @Override
    public void itemClicked (long id){
        View fragmentContainer = findViewById(R.id.fragment_container);
        if(fragmentContainer != null){
            ResepDetailFragment details = new ResepDetailFragment();

            FragmentTransaction ft = getSupportFragmentManager()
        }
    }

}