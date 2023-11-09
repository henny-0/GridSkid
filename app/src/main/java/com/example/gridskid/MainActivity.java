package com.example.gridskid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    List<Item> itemList;

    Adapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        populateItemList();

        itemList = new ArrayList<>();

        myadapter = new Adapter(this, R.layout.activity_main, itemList);

        gridView.setAdapter(myadapter);


    }

    private void populateItemList() {
        // Create new Item objects and add them to the list
        Item item1 = new Item("Sakura Haruno", R.drawable.animegirl1);
        itemList.add(item1);

        Item item2 = new Item("Hinata Hyuga", R.drawable.animegirl1);
        itemList.add(item2);

        Item item3 = new Item("Asuna Yuuki", R.drawable.animegirl1);
        itemList.add(item3);

        Item item4 = new Item("Mikasa Ackerman", R.drawable.animegirl1);
        itemList.add(item4);

        Item item5 = new Item("Yui Hirasawa", R.drawable.animegirl1);
        itemList.add(item5);

        Item item6 = new Item("Lucy Heartfilia", R.drawable.animegirl1);
        itemList.add(item6);

        Item item7 = new Item("Erza Scarlet", R.drawable.animegirl1);
        itemList.add(item7);

        Item item8 = new Item("Nami", R.drawable.animegirl1); // Nami is commonly known by her first name only
        itemList.add(item8);

        Item item9 = new Item("Tsukasa Hiiragi", R.drawable.animegirl1);
        itemList.add(item9);
    }

}