package br.com.metalumens.relatoriosapp;

import br.com.metalumens.relatoriosapp.models.entities.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("g95-110v", "lampada retro g95", 3.0, 13.50, 1.0, 5.0);

        System.out.println(produto);
    }
}
