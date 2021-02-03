package com.example.projetorecyclerview.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.projetorecyclerview.R;
import com.example.projetorecyclerview.adapter.AdapterProdutos;
import com.example.projetorecyclerview.model.Produto;
import com.example.projetorecyclerview.repositorio.Repositorio;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private RecyclerView rvProdutos;
    private Button btnCadastrar;

    private ArrayList<Produto> produtos;

    private AdapterProdutos adapterProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnCadastrar = findViewById(R.id.btn_cadastrar);
        this.btnCadastrar.setOnClickListener(this);

        this.rvProdutos = findViewById(R.id.rv_produtos);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        this.rvProdutos.setLayoutManager(linearLayoutManager);

        Repositorio repositorio = new Repositorio();
        this.produtos = new ArrayList<>();
        this.produtos = repositorio.buscarProdutos();

        this.adapterProdutos = new AdapterProdutos(this, this.produtos);

        this.rvProdutos.setAdapter(this.adapterProdutos);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_cadastrar:
                Toast.makeText(this, "clicou no botão de cadastro", Toast.LENGTH_SHORT).show();
        }
    }
}