package com.example.androidhf07;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class allat_RecyclerViewAdapter extends RecyclerView.Adapter<allat_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<allat> allatList;

    public allat_RecyclerViewAdapter(Context context, ArrayList<allat> allatList){
        this.context = context;
        this.allatList = allatList;
    }

    @NonNull
    @Override
    public allat_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item,parent,false);

        return new allat_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull allat_RecyclerViewAdapter.MyViewHolder holder, int position) {


        holder.nev.setText(allatList.get(position).getNev());
        holder.szoveg.setText(allatList.get(position).getSzoveg());
        holder.kep.setImageResource(allatList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return allatList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView kep;
        TextView nev;
        TextView szoveg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            kep = itemView.findViewById(R.id.kep);
            nev = itemView.findViewById(R.id.nev);
            szoveg = itemView.findViewById(R.id.szoveg);
        }
    }
}
