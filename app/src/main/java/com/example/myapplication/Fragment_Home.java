package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class Fragment_Home extends Fragment {

    ArrayList<Product> lsProducts;
    View view;
    ProductITF productITF;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment__home, container, false);
        lsProducts = new ArrayList<>();
        AddProduct();
        GridView gv = view.findViewById(R.id.LvProduct);

        gv.setAdapter(new Adapter_Product(getActivity(),R.layout.custom_lv,lsProducts));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                productITF = (ProductITF) getActivity();
                productITF.senData(lsProducts.get(i));
            }
        });
        return view;
    }

    private void AddProduct() {
        lsProducts.add(new Product(R.drawable.img,"01","Iphone 11",16000));
        lsProducts.add(new Product(R.drawable.img_1,"02","Iphone 12",33000));
        lsProducts.add(new Product(R.drawable.img_2,"03","Iphone SE",300000));
        lsProducts.add(new Product(R.drawable.img_3,"04","Iphone XG",13000));
        lsProducts.add(new Product(R.drawable.img_4,"05","Samsung Note 20",150000));
        lsProducts.add(new Product(R.drawable.img_5,"06","Samsung A73",15000));
        lsProducts.add(new Product(R.drawable.img_6,"07","Oppo Reno5",210000));
        lsProducts.add(new Product(R.drawable.img_7,"08","Oppo A95",15000));
        lsProducts.add(new Product(R.drawable.img_8,"09","Oppo A16",10000));
        lsProducts.add(new Product(R.drawable.img_9,"10","Vivo V21",280000));
        lsProducts.add(new Product(R.drawable.img_10,"11","Vivo V20",280000));
        lsProducts.add(new Product(R.drawable.img_11,"12","Xiaomi 11T",280000));
        lsProducts.add(new Product(R.drawable.img_12,"13","Xiaomi Redmi 9C",180000));

    }
}