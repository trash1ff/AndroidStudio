package com.example.projetofucapi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class FuncionariosViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public Context context;
    public TextView nome, login, cargo;
    public int id;

    public FuncionariosViewHolder(ConstraintLayout v, Context context) {
        super(v);
        this.context = context;
        nome = v.findViewById(R.id.itemName);
        login = v.findViewById(R.id.itemLogin);
        cargo = v.findViewById(R.id.itemCargo);
        v.setOnClickListener(this);
    }

    public void onClick(View v) {
        Toast.makeText(context, "Olá " + this.nome.getText().toString(), Toast.LENGTH_LONG)
                .show();
    }
}
