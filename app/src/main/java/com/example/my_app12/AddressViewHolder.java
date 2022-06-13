package com.example.my_app12;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView tvAdress;

    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAdress=itemView.findViewById(R.id.address);
    }
    public void bind(String adress) {
        tvAdress.setText(adress);
    }
}
