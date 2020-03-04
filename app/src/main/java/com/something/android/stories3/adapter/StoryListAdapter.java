package com.something.android.stories3.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.something.android.stories3.Model.Story;
import com.something.android.stories3.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by MOHAMED on 01/07/2018.
 */

public class StoryListAdapter extends BaseAdapter {

    ArrayList<Story> dataList;
    private Context context;

    public StoryListAdapter(ArrayList<Story> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (convertView == null) {
            v = LayoutInflater.from(context).inflate(R.layout.list_item , parent, false);
        }

        ((TextView) v.findViewById(R.id.text_view_list)).setText(dataList.get(position).getmTitle());
        //((ImageView) v.findViewById(R.id.img_view_list)).setImageResource(dataList.get(position).getmImg());

        ImageView imageView = (ImageView) v.findViewById(R.id.img_view_list);
        //Bitmap bitmap = BitmapFactory.decodeResource(v.getResources(), dataList.get(position).getmImg());
        //imageView.setImageBitmap(bitmap);


        Picasso.with(v.getContext()).load(dataList.get(position).getmImg()).into(imageView);





        return v;
    }

}
