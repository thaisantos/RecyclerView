package com.example.projetorecyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetorecyclerview.R;
import com.example.projetorecyclerview.model.Produto;
import com.example.projetorecyclerview.view.ProdutoActivity;
import com.example.projetorecyclerview.viewholder.ViewHolderProduto;

import java.util.ArrayList;

public class AdapterProdutos extends RecyclerView.Adapter<ViewHolderProduto> {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Produto> listaDeProdutos;

    public AdapterProdutos(Context context, ArrayList listaDeProdutos){
        this.context = context;
        this.layoutInflater = LayoutInflater.from(this.context);
        this.listaDeProdutos = listaDeProdutos;
    }

    @NonNull
    @Override
    public ViewHolderProduto onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflar um novo xml e o atribuir a um objeto do tipo view
        View view = this.layoutInflater.inflate(R.layout.item_produto, parent, false);

        return new ViewHolderProduto(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderProduto holder, int position) {
        //a viewholder criada chega aqui para que os dados sejam ligados as suas respect views.
        Produto p = this.listaDeProdutos.get(position);
        holder.tvNome.setText(p.getNome());
        holder.tvPreco.setText("R$ "+String.format("%.2f",p.getPreco()));

        holder.linearLayoutProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context, "Clicou no LinearLayout", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, ProdutoActivity.class);
                intent.putExtra("produto", p);

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        //qtde de lista a ser criada
        return this.listaDeProdutos.size();
    }

    public void atualizarAdapter(ArrayList<Produto> produtos){
        this.listaDeProdutos.clear();
        this.listaDeProdutos.addAll(produtos);
        notifyDataSetChanged();
    }
}
