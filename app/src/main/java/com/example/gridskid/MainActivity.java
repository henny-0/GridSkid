package com.example.gridskid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Shape> itemList;

    Adapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        itemList = new ArrayList<Shape>();
        populateItemList();

        myadapter = new Adapter(itemList, this);
        gridView.setAdapter(myadapter);


    }

    private void populateItemList() {
        // Create new Shape objects and add them to the list
        Shape item1 = new Shape("Sakura Haruno", R.drawable.animegirl1);
        itemList.add(item1);

        Shape item2 = new Shape("Hinata Hyuga", R.drawable.animegirl1);
        itemList.add(item2);

        Shape item3 = new Shape("Asuna Yuuki", R.drawable.animegirl1);
        itemList.add(item3);

        Shape item4 = new Shape("Mikasa Ackerman", R.drawable.animegirl1);
        itemList.add(item4);

        Shape item5 = new Shape("Yui Hirasawa", R.drawable.animegirl1);
        itemList.add(item5);

        Shape item6 = new Shape("Lucy Heartfilia", R.drawable.animegirl1);
        itemList.add(item6);

        Shape item7 = new Shape("Erza Scarlet", R.drawable.animegirl1);
        itemList.add(item7);

        Shape item8 = new Shape("Nami", R.drawable.animegirl1); // Nami is commonly known by her first name only
        itemList.add(item8);

        Shape item9 = new Shape("Tsukasa Hiiragi", R.drawable.animegirl1);
        itemList.add(item9);

        Shape item10 = new Shape("Abigail Akeno", R.drawable.animegirl1);
        itemList.add(item10);

        Shape item11 = new Shape("Akito Akane", R.drawable.animegirl1);
        itemList.add(item11);

        Shape item12 = new Shape("Asuka Ami", R.drawable.animegirl1);
        itemList.add(item12);


    }

}