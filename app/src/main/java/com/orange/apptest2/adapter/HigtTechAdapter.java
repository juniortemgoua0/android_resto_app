package com.orange.apptest2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.orange.apptest2.HigtTech;
import com.orange.apptest2.R;

import java.util.List;

public class HigtTechAdapter extends BaseAdapter {
    private Context context;
    private List<HigtTech> HighTechItemList;
    private LayoutInflater inflater;

    public HigtTechAdapter(Context context, List<HigtTech> highTechItemList) {
        this.context = context;
        this.HighTechItemList = highTechItemList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return HighTechItemList.size();
    }

    @Override
    public HigtTech getItem(int position) {
        return HighTechItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = inflater.inflate(R.layout.adapter_item,null);

        HigtTech currentItem = getItem(position);
        TextView itemName = view.findViewById(R.id.item_name);
        itemName.setText(currentItem.getItemName());

        TextView itemPrice = view.findViewById(R.id.item_price);
        itemPrice.setText( String.valueOf(currentItem.getItemPrice())  + " $");

        ImageView itemImage = view.findViewById(R.id.item_image);
        int resId = this.context.getResources().getIdentifier(currentItem.getItemDrawable() , "drawable", this.context.getPackageName());
        itemImage.setImageResource(resId);
        return view;
    }
}
