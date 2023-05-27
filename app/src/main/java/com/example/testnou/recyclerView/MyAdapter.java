package com.example.testnou.recyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testnou.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    Context context;
    ArrayList<Trips> tripsArrayList;
    private final RecyclerViewInterface recyclerViewInterface;


    public MyAdapter(Context context, ArrayList<Trips> tripsArrayList, RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.tripsArrayList = tripsArrayList;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(v, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Trips trips = tripsArrayList.get(position);
        holder.description.setText(trips.heading);
        holder.image.setImageResource(trips.image);
    }

    @Override
    public int getItemCount() {
        return tripsArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ShapeableImageView image;
        TextView description;

        public MyViewHolder(@NonNull View itemView ,RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            image = itemView.findViewById(R.id.title_image);
            description = itemView.findViewById(R.id.trip_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(recyclerViewInterface != null){
                        int position = getAdapterPosition();

                        if(position != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(position);
                        }
                    }
                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    if(recyclerViewInterface != null){
                        int position = getAdapterPosition();

                        if(position != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onLongClick(position);
                        }
                    }
                    return false;
                }
            });
        }
    }
}
