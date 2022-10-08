package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements ProductITF{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void senData(Product product) {
        FragmentInfor fragmentInfor =
                (FragmentInfor) getSupportFragmentManager().findFragmentById(R.id.fragmentInfor_Ac1_N);
        Configuration configuration = getResources().getConfiguration();
        //Nếu nàm hình ngang
        if(fragmentInfor != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            fragmentInfor.setInfor(product);
        }else{//Nếu màn hình dọc
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("Infor",product);
            startActivity(intent);
        }
    }
}