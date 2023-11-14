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

        Shape item13 = new Shape("Asami Aletta", R.drawable.animegirl1);
        itemList.add(item13);

        Shape item14 = new Shape("Ayano Umeko", R.drawable.animegirl1);
        itemList.add(item14);

        Shape item15 = new Shape("Hiroshi Scarlet", R.drawable.animegirl1);
        itemList.add(item15);

        Shape item16 = new Shape("Kanako Aiko", R.drawable.animegirl1);
        itemList.add(item16);

        Shape item17 = new Shape("Asuna Ayu", R.drawable.animegirl1);
        itemList.add(item17);

        Shape item18 = new Shape("Chihiro Emi", R.drawable.animegirl1);
        itemList.add(item18);

        Shape item19 = new Shape("Chouko Chika", R.drawable.animegirl1);
        itemList.add(item19);

        Shape item20 = new Shape("Rachelle Kiyomi", R.drawable.animegirl1);
        itemList.add(item20);

        Shape item21 = new Shape("Nami Hinata", R.drawable.animegirl1);
        itemList.add(item21);



    }

}