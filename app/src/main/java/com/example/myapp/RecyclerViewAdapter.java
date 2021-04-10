package com.example.myapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Integer> imageCountry = new ArrayList<Integer>();
    private ArrayList<String> namaCountry = new ArrayList<>();
    private ArrayList<String> CountryDetail = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<Integer> imageCountry, ArrayList<String> namaCountry, ArrayList<String> courtCountry, Context context) {
        this.imageCountry = imageCountry;
        this.namaCountry = namaCountry;
        this.CountryDetail = CountryDetail;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(imageCountry.get(position)).into(holder.imageView );

        holder.textView .setText(namaCountry.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context, imageCountry.get(position), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image_Country", imageCountry.get(position));
                intent.putExtra("nama_Country", namaCountry.get(position));
                intent.putExtra("detail_Country", CountryDetail.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaCountry.size();
    }

    public class ViewHolder extends RecyclerView
            .ViewHolder{
        CircleImageView imageView ;
        TextView textView ;
        ConstraintLayout constraintLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView  = itemView.findViewById(R.id.iv_Country);
            textView  = itemView.findViewById(R.id.tv_nama_Country);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
