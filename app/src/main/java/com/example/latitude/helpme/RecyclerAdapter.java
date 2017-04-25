package com.example.latitude.helpme;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mariem on 4/25/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {


    private ArrayList<adviceModle> arrayList= new ArrayList<adviceModle>();

    public RecyclerAdapter(ArrayList<adviceModle> arrayList){
        this.arrayList=arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.advice_layout,parent,false);


        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        adviceModle advicem = arrayList.get(position);
        holder.imageView.setImageResource(advicem.getImg_res());

        holder.title.setText((CharSequence) advicem.getTitle());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title;


        public RecyclerViewHolder(View view )
        {
            super(view);

            imageView=(ImageView)view.findViewById(R.id.image);
            title=(TextView)view.findViewById(R.id.title);

        }

    }
}

