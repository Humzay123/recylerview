package com.example.recylerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder>{

    Context context;
    ArrayList<contactModal> arraycontact;
    RecyclerContactAdapter(Context context , ArrayList<contactModal> arraycontact ){
        this.context= context;
        this.arraycontact= arraycontact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View view=  LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.cntctimg.setImageResource(arraycontact.get(position).img);
    holder.cntctblock.setText(arraycontact.get(position).contact);
    holder.numblock.setText(arraycontact.get(position).number);

    }

    @Override
    public int getItemCount() {
        return arraycontact.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView cntctblock, numblock;
        ImageView cntctimg;

        @SuppressLint("CutPasteId")
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cntctblock =itemView.findViewById(R.id.cntctblock);
            numblock = itemView.findViewById(R.id.cntctblock);
            cntctimg = itemView.findViewById(R.id.cntctimg);







        }



    }
}

