package com.example.projetofucapi;

import android.content.Context;

import java.util.ArrayList;

public class FuncionarioDAO {
    private Context context;
    private static ArrayList<Funcionario> funcionariosList = new ArrayList<>();

    public FuncionarioDAO(Context context) {
        this.context = context;
    }

    public ArrayList<Funcionario> getList() {
        if (funcionariosList.size() == 0) {
            funcionariosList.add(new Funcionario(0, "Gabriel", "gabriel@gmail.com",
                    "123", "Técnico em Informática"));
            funcionariosList.add(new Funcionario(1, "Jailson", "jailson@gmail.com",
                    "456", "Programador"));
            funcionariosList.add(new Funcionario(2, "Gilvanildo", "gilvanildo@gmail.com",
                    "789", "Suporte em Redes"));
            funcionariosList.add(new Funcionario(3, "Lincon", "lincon@gmail.com",
                    "000", "HelpDesk"));
        }
        return funcionariosList;
    }


    public Funcionario get(int id) {
        return funcionariosList.get(id);
    }

}
