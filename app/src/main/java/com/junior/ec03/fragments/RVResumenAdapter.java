package com.junior.ec03.fragments;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVResumenAdapter extends RecyclerView.Adapter <RVResumenAdapter.ResumeVH> {


    @NonNull
    @Override
    public ResumeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ResumeVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ResumeVH extends RecyclerView.ViewHolder{

        public ResumeVH(@NonNull View itemView){
            super(itemView);
        }
    }
}
