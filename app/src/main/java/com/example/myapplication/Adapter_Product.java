package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_Product extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Product> lsProducts;

    public Adapter_Product(Context context, int layout, ArrayList<Product> lsProducts) {
        this.context = context;
        this.layout = layout;
        this.lsProducts = lsProducts;
    }

    @Override
    public int getCount() {
        return lsProducts.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);


        ImageView img = view.findViewById(R.id.img);
        TextView txtTen = view.findViewById(R.id.txtTenSp);


        img.setImageResource(lsProducts.get(i).getImg());
        txtTen.setText(lsProducts.get(i).getName());
        return view;
    }
}
