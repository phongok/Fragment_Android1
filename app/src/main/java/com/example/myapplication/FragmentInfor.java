package com.example.myapplication;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentInfor extends Fragment{
    TextView txtTen;
    TextView txtGia;
    View view;
    Product product2;
    RatingBar ratingBar;
    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_infor, container, false);
        txtTen = view.findViewById(R.id.txtTen_infor);
        txtGia = view.findViewById(R.id.txtGia_Infor);
        ratingBar = view.findViewById(R.id.rtb);
        imageView = view.findViewById(R.id.img_Infor);

        Button btnMua = view.findViewById(R.id.btnMua);

        btnMua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Mua Thành Công", Toast.LENGTH_SHORT).show();
            }
        });


        Configuration configuration = getResources().getConfiguration();
        if(configuration.orientation != Configuration.ORIENTATION_LANDSCAPE){
            if(product2!=null){
                imageView.setImageResource(product2.getImg());
                txtTen.setText(product2.getName());
                txtGia.setText(product2.getPrice()+"VNĐ");
                ratingBar.setVisibility(view.VISIBLE);
            }
        }
        return view;
    }
    public void setInfor(Product product){
        imageView.setImageResource(product.getImg());
        ratingBar.setVisibility(view.VISIBLE);
        txtTen.setText(product.getName());
        txtGia.setText(product.getPrice()+"VNĐ");
    }
    public void setInfor2(Product product){
        product2 = product;
    }


}