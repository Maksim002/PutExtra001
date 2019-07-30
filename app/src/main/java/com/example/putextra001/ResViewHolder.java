package com.example.putextra001;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ResViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    private Listener listener;


    public ResViewHolder(@NonNull View itemView, final Listener listener ) {
        super(itemView);
        textView = itemView.findViewById(R.id.textVPut);
        this.listener = listener;
    }

    public void bind(final Content content) {
        textView.setText(content.getName(getAdapterPosition()));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClikGaleri(getAdapterPosition(), content);
            }
        });
    }
}
