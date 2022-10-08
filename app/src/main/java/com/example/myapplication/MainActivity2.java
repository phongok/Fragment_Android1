package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Product product = (Product) intent.getSerializableExtra("Infor");
        FragmentInfor fragmentInfor2 = (FragmentInfor) getSupportFragmentManager().findFragmentById(R.id.fragmentInfor_Ac2);
        Configuration configuration2 = getResources().getConfiguration();
        fragmentInfor2.setInfor(product);


   }
}