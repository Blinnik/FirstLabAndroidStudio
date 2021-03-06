package com.example.myapplication;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter. RecyclerviewViewHolder>{
    ArrayList <Element> content;

    public RecyclerAdapter(ArrayList<Element> content){
        this.content=content;
    }
    public class  RecyclerviewViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView des;
        public RecyclerviewViewHolder(View view){
            super(view);
            img=(ImageView) view.findViewById(R.id.img);
            des = (TextView) view.findViewById(R.id.desc);
        }
    }
    @Override
    public  RecyclerviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);
        return new RecyclerviewViewHolder(view);

    }
    @Override
    public void onBindViewHolder(RecyclerviewViewHolder holder, int position){
        if(position % 2==0) {
            holder.itemView.setBackgroundColor(Color.WHITE);
            holder.des.setText(content.get(position).getDescr());
            holder.img.setImageResource(content.get(position).getImg());
        }
        else {
            holder.itemView.setBackgroundColor(Color.LTGRAY);
            holder.des.setText(content.get(position).getDescr());
            holder.img.setImageResource(content.get(position).getImg());
        }
    }
    @Override
    public int getItemCount(){
        return content.size();
    }


}