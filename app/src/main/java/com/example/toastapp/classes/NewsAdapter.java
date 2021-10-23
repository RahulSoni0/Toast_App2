package com.example.toastapp.classes;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.toastapp.R;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private ArrayList<NewsModel> newsList;

    public NewsAdapter(ArrayList<NewsModel> newsList) {
        this.newsList = newsList;
        Log.d("#### NewsAdapter : ","constructor : "+newsList.size());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(position);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView titleTV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.idNewsItemModelIV);
            titleTV=itemView.findViewById(R.id.idNewsItemDescribeTV);//describeTv real mein title hold karega bas

        }
        public void setData(int currentPos){
            //imageView.setImageDrawable(itemView.getResources().getDrawable(newsList.get(currentPos).getImageAdr()));
            Glide.with(itemView.getContext()).load(newsList.get(currentPos).getImageAdr()).into(imageView);
            titleTV.setText(newsList.get(currentPos).getTitle());
            //to do: when readMore is clicked then go to full news with intent same as the unique id


        }
    }
}