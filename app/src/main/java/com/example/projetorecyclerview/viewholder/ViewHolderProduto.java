package com.example.projetorecyclerview.viewholder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetorecyclerview.R;


public class ViewHolderProduto extends RecyclerView.ViewHolder {
    public LinearLayout linearLayoutProduto;
    public TextView tvNome;
    public TextView tvPreco;


    public ViewHolderProduto(@NonNull View itemView) {
        super(itemView);
        this.linearLayoutProduto = itemView.findViewById(R.id.linearLayoutProduto);
        this.tvNome = itemView.findViewById(R.id.tv_nome);
        this.tvPreco = itemView.findViewById(R.id.tv_preco);
    }
}
