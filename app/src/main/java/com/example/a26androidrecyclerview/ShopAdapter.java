package com.example.a26androidrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder>
{
    ArrayList<DataShop> arrayList;
    Context context;

    public ShopAdapter(ArrayList<DataShop> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.textView.setText(arrayList.get(position).getTen());
        holder.imageView1.setImageResource(arrayList.get(position).getHinhAnh());
    }

    @Override
    public int getItemCount()
    {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        ImageView imageView1;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            textView= itemView.findViewById(R.id.txtName);
            imageView1 = itemView.findViewById(R.id.imgHinh);
        }
    }
}
