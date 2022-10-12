package br.com.metalumens.relatoriosapp;

import br.com.metalumens.relatoriosapp.models.entities.Pedido;
import br.com.metalumens.relatoriosapp.models.entities.Produto;

public class TestePedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("joao", "12/10/2022", 1234, 12.50, "aprovado", 123132165L, 123.0, 23.4, 0.0, "b2w", "skyhub", false);
        pedido.addProdutos(new Produto("g95-110v", "lampada retro g95", 3.0, 13.50, 1.0, 5.0));
        pedido.addProdutos(new Produto("st64-110v", "lampada retro st64", 10.0, 24.0, 2.0, 6.0));
        pedido.addProdutos(new Produto("t185-110v", "lampada retro t185", 2.0, 24.0, 0.0, 6.0));

        System.out.println(pedido);
    }
}
