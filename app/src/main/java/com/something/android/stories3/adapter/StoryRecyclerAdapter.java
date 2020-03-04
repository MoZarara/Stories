package com.something.android.stories3.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.something.android.stories3.ListActivity;
import com.something.android.stories3.Model.Story;
import com.something.android.stories3.R;
import com.squareup.picasso.Cache;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 * Created by MOHAMED on 05/07/2018.
 */

public class StoryRecyclerAdapter extends RecyclerView.Adapter<StoryRecyclerAdapter.ViewHolder> {

    ArrayList<Story> dataList;
    Context context;


    public StoryRecyclerAdapter(ArrayList<Story> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final Story story = dataList.get(position);

        holder.titleTextView.setText(story.getmTitle());

        //Bitmap bitmap = BitmapFactory.decodeResource(holder.itemView.getResources(), story.getmImg());
        //holder.imgImageView.setImageBitmap(bitmap);

        final Context ccontext = holder.imgImageView.getContext();
        Picasso.with(ccontext).load(story.getmImg()).into(holder.imgImageView);

        /*new Thread(new Runnable() {
            @Override
            public void run() {
                Picasso.with(ccontext).load(story.getmImg()).into(holder.imgImageView);
            }
        });*/


        /*Picasso.with(ccontext)
                .load(story.getmImg())
                .into(holder.imgImageView, new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {
                        //do smth when picture is loaded successfully
                        Picasso.with(ccontext).load(story.getmImg()).into(holder.imgImageView);

                    }

                    @Override
                    public void onError() {
                        Picasso.with(ccontext).load(R.drawable.img_start).into(holder.imgImageView);

                        //do smth when there is picture loading error
                    }
                });*/


        final int index = holder.getAdapterPosition();
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ListActivity) context).openStories(dataList.get(index));
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return dataList.get(position).getmType();
    }

    /*
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;    }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).titleTextView.setText(dataList.get(position).getmTitle());
        ((ViewHolder) holder).imgImageView.setImageResource(dataList.get(position).getmImg());
        final int index = holder.getAdapterPosition();
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ListActivity) context).openStories(dataList.get(index));
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

*/

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView titleTextView;
        public ImageView imgImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            titleTextView = (TextView) itemView.findViewById(R.id.text_view_list);
            imgImageView = (ImageView) itemView.findViewById(R.id.img_view_list);
        }

        /*
        public void setText(String text) {
            if (titleTextView == null) {
                return;
            }
            if (text == null) {
                return;
            }
            titleTextView.setText(text);
        }
*/
/*
        public void setImage(Bitmap bitmap) {
            if (imgImageView == null) {
                return;
            }
            if (bitmap == null) {
                return;
            }
            imgImageView.setImageBitmap(bitmap);
        }
*/
    }



}




