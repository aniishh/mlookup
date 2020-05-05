package com.example.mlookup.activity.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mlookup.R;
import com.example.mlookup.activity.main.data.Latest;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.LatestMovieHolder> {
    private ArrayList<Latest> latestMovies;

    public CardAdapter(ArrayList<Latest> latestMovies) {
        this.latestMovies = latestMovies;
    }

    @NonNull
    @Override
    public LatestMovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new LatestMovieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LatestMovieHolder holder, int position) {
        Latest latestMovie = latestMovies.get(position);
        holder.setDetails(latestMovie);
    }

    @Override
    public int getItemCount() {
        return latestMovies.size();
    }

    static class LatestMovieHolder extends RecyclerView.ViewHolder {

        private TextView text_title, text_release_date;

        LatestMovieHolder(View itemView) {
            super(itemView);
            text_title = itemView.findViewById(R.id.text_title);
            text_release_date = itemView.findViewById(R.id.text_release_date);
        }

        void setDetails(Latest latest) {
            text_title.setText(latest.getOriginal_title());
            text_release_date.setText((CharSequence) latest.getRelease_date());
        }
    }


}
