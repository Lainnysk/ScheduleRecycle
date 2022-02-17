package com.example.recycv_timetable;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Model> rasp;

    public RecycleViewAdapter(Context context, List<Model> rasp) {
        this.rasp = rasp;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public RecycleViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter.ViewHolder holder, int position) {
        Model model = rasp.get(position);
        holder.day.setText(model.getDay());
        holder.predmet.setText(model.getPredmet());
        holder.predmet1.setText(model.getPredmet1());
        holder.predmet2.setText(model.getPredmet2());
        holder.predmet3.setText(model.getPredmet3());
        holder.predmet4.setText(model.getPredmet4());
        holder.prepod.setText(model.getPrepod());
        holder.prepod1.setText(model.getPrepod1());
        holder.prepod2.setText(model.getPrepod2());
        holder.prepod3.setText(model.getPrepod3());
        holder.prepod4.setText(model.getPrepod4());

    }

    @Override
    public int getItemCount() { return rasp.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView day;
        final TextView predmet;
        final TextView predmet1;
        final TextView predmet2;
        final TextView predmet3;
        final TextView predmet4;
        final TextView prepod;
        final TextView prepod1;
        final TextView prepod2;
        final TextView prepod3;
        final TextView prepod4;

        ViewHolder(View view) {
            super(view);
            day = view.findViewById(R.id.day);
            predmet = view.findViewById(R.id.predmet);
            predmet1 = view.findViewById(R.id.predmet1);
            predmet2 = view.findViewById(R.id.predmet2);
            predmet3 = view.findViewById(R.id.predmet3);
            predmet4 = view.findViewById(R.id.predmet4);
            prepod = view.findViewById(R.id.prepod);
            prepod1 = view.findViewById(R.id.prepod1);
            prepod2 = view.findViewById(R.id.prepod2);
            prepod3 = view.findViewById(R.id.prepod3);
            prepod4 = view.findViewById(R.id.prepod4);
        }
    }
}
