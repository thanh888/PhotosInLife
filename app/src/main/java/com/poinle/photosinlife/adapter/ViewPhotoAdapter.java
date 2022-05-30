package com.poinle.photosinlife.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.poinle.photosinlife.DetailActivity;
import com.poinle.photosinlife.R;
import com.poinle.photosinlife.model.Image;

import java.util.List;

public class ViewPhotoAdapter extends RecyclerView.Adapter<ViewPhotoAdapter.ViewHolder> {
    Context context;
    List<Image> imageList;

    public ViewPhotoAdapter(Context context) {
        this.context = context;
    }
    public void setData(List<Image> imageList){
        this.imageList = imageList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Image image = imageList.get(position);
        holder.imageView.setImageResource(image.getSrc_photo());
        holder.txt_name.setText(image.getName_photo());
        holder.cardView.setOnClickListener(view -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("name_photo", image.getName_photo());
            intent.putExtra("src_photo", String.valueOf(image.getSrc_photo()));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txt_name;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_item);
            txt_name = itemView.findViewById(R.id.name_image);
            cardView = itemView.findViewById(R.id.card_view);

        }
    }
}
