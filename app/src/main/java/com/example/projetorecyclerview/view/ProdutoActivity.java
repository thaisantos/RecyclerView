package com.example.projetorecyclerview.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.projetorecyclerview.R;
import com.example.projetorecyclerview.model.Produto;


public class ProdutoActivity extends AppCompatActivity {

    private TextView tvNomeProduto;
    private TextView tvPrecoProduto;

    Produto p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        this.tvNomeProduto = findViewById(R.id.tv_nome);
        this.tvPrecoProduto = findViewById(R.id.tv_preco);

        //verifica se existem parametros passados na intent
        if(getIntent().getExtras() != null){
            p = (Produto) getIntent().getSerializableExtra("produto");

            this.tvNomeProduto.setText(p.getNome());
            this.tvPrecoProduto.setText("R$ "+ String.format("%.2f", p.getPreco()));
        }


    }
}