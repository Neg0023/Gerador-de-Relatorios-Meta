package br.com.metalumens.relatoriosapp;

import br.com.metalumens.relatoriosapp.models.entities.Pedido;

public class TestePedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("joao", "12/10/2022", 1234, 12.50, "aprovado", 123132165L, 123.0, 23.4, 0.0, "b2w", "skyhub", false);

        System.out.println(pedido);
    }
}
