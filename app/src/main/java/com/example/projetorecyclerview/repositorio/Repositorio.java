package com.example.projetorecyclerview.repositorio;

import com.example.projetorecyclerview.model.Produto;

import java.util.ArrayList;

public class Repositorio {

    public Repositorio(){

    }

    public ArrayList<Produto> buscarProdutos(){
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Coca Cola", 5.20);
        Produto p2 = new Produto("Batata", 7.50);
        Produto p3 = new Produto("Chocolate", 3.99);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        return produtos;
    }
}
