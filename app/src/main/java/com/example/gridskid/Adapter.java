package com.example.gridskid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends ArrayAdapter<Shape> {

    ArrayList<Shape> shapeArrayList;
    Context context;

/*
    public Adapter(ArrayList<Shape> shapeArrayList, Context context){
        super(context, R.layout.grid_item,shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context;
    }
*/

    public Adapter(ArrayList<Shape> shapeArrayList, Context context) {
        super(context, R.layout.grid_item,shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context;
    }

    private static class Viewholder{
        TextView shapeName;
        ImageView shapeImg;
    }

    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent){
        Shape shape = getItem(position);
        Viewholder viewholder;

        if(convertView==null) {
            viewholder = new Viewholder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grid_item, parent, false);
            viewholder.shapeName = convertView.findViewById(R.id.textView);
            viewholder.shapeImg = convertView.findViewById(R.id.imageView);
            convertView.setTag(viewholder);
        }
        else{
            viewholder = (Viewholder) convertView.getTag();
        }

        viewholder.shapeName.setText(shape.getShapeName());
        viewholder.shapeImg.setImageResource(shape.getShapeImg());
        return convertView;
    }



}
