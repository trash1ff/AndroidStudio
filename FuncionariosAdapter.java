package com.example.projetofucapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FuncionariosAdapter extends RecyclerView.Adapter<FuncionariosViewHolder> {
    private Context context;
    private ArrayList<Funcionario> funcionarios;
    FuncionarioDAO funcionarioDAO;

    public FuncionariosAdapter(Context context) {
        this.context = context;
        funcionarioDAO = new FuncionarioDAO(context);
        update();
    }

    public void update() { funcionarios = funcionarioDAO.getList(); }

    public FuncionariosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ConstraintLayout v = (ConstraintLayout) LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        FuncionariosViewHolder vh = new FuncionariosViewHolder(v, context);
        return vh;
    }

    public void onBindViewHolder(FuncionariosViewHolder holder, int position) {
        holder.nome.setText(funcionarios.get(position).getNome());
        holder.login.setText(funcionarios.get(position).getLogin());
        holder.id = funcionarios.get(position).getId();
        holder.cargo.setText(funcionarios.get(position).getCargo());
    }

    public int getItemCount() { return funcionarios.size(); }
}
