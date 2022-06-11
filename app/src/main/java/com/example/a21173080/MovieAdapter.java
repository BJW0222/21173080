package com.example.a21173080;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    ArrayList<Movie> items = new ArrayList<Movie>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.movie_item, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewholder, int position) {
        Movie item = items.get(position);
        viewholder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void addItem(Movie item) {
        items.add(item);
    }
    public void setItems(ArrayList<Movie> items) {
        this.items = items;
    }
    public Movie getItem(int position) {
        return items.get(position);
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView openDt;
        TextView movieName;
        TextView peopleCount;
        TextView rnum;
        TextView audiAcc;

        public ViewHolder(View itemView) {
            super(itemView);
            openDt =itemView.findViewById(R.id.openDt);
            movieName = itemView.findViewById(R.id.movieName);
            peopleCount = itemView.findViewById(R.id.peopleCount);
            rnum = itemView.findViewById(R.id.rnum);
            audiAcc = itemView.findViewById((R.id.audiAcc));
        }
        public void setItem(Movie item) {
            openDt.setText("개봉일 : " + item.openDt);
            movieName.setText(item.movieNm);
            peopleCount.setText(item.audiCnt + " 명");
            rnum.setText(item.rnum + "위");
            audiAcc.setText("누적관계수▲  " + item.audiAcc + " 명");
        }

    }

}
