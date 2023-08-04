package com.junior.ec03.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.junior.ec03.modelo.PlatoModel;

import java.util.List;

public class RVResumenAdapter extends RecyclerView.Adapter <RVResumenAdapter.ResumeVH> {
    private List<PlatoModel> Plato;

    public RVResumenAdapter(List<PlatoModel> plato) {
        this.Plato = plato;
    }

    @NonNull
    @Override
    public ResumeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ResumeVH holder, int position) {



        return null;
    }

    @Override
    public int getItemCount() {
        return Plato.size();
    }

    class ResumeVH extends RecyclerView.ViewHolder{

        public ResumeVH(@NonNull View itemView){
            super(itemView);
        }
    }
}
