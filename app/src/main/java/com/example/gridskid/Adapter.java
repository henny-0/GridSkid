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
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends ArrayAdapter<Item> {


    Context mContext;
    int resourceId;
    List <Item>  itemList;
    public Adapter(Context context, int resource, List<Item> itemList) {
        super(context, resource, itemList);
        this.mContext = context;
        this.resourceId = resource;
        this.itemList = itemList;
    }

    static class ViewHolder{
        ImageView imgItem;
        TextView txtItem;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View itemView = convertView;
        ViewHolder holder = null;

        if (itemView == null)
        {
            final LayoutInflater layoutInflater =
                    (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = layoutInflater.inflate(resourceId, parent, false);

            holder = new ViewHolder();
            holder.imgItem = (ImageView) itemView.findViewById(R.id.imageView);
            holder.txtItem = (TextView) itemView.findViewById(R.id.textView);
            itemView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) itemView.getTag();
        }

        Item item = getItem(position);
        holder.imgItem.setImageResource(item.getImageID());
        holder.txtItem.setText(item.getDescription());

        return itemView;
    }


}
