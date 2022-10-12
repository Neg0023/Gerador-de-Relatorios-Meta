package br.com.metalumens.relatoriosapp.models.entities;

public class Pedido {

    private final String nome;
    private final String data;
    private final Integer numero;
    private final Double valorFrete;
    private final String situacao;
    private final Long origem;
    private final Double totalProdutos;
    private final Double totalVenda;
    private final Double desconto;
    private final String loja;
    private final String tipoIntegracao;
    private final Boolean descontoEmPorcentagem;

    public Pedido(String nome, String data, Integer numero, Double valorFrete, String situacao, Long origem, Double totalProdutos, Double totalVenda, Double desconto, String loja, String tipoIntegracao, Boolean descontoEmPorcentagem) {
        this.nome = nome;
        this.data = data;
        this.numero = numero;
        this.valorFrete = valorFrete;
        this.situacao = situacao;
        this.origem = origem;
        this.totalProdutos = totalProdutos;
        this.totalVenda = totalVenda;
        this.desconto = desconto;
        this.loja = loja;
        this.tipoIntegracao = tipoIntegracao;
        this.descontoEmPorcentagem = descontoEmPorcentagem;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public String getSituacao() {
        return situacao;
    }

    public Long getOrigem() {
        return origem;
    }

    public Double getTotalProdutos() {
        return totalProdutos;
    }

    public Double getTotalVenda() {
        return totalVenda;
    }

    public Double getDesconto() {
        return desconto;
    }

    public String getLoja() {
        return loja;
    }

    public String getTipoIntegracao() {
        return tipoIntegracao;
    }

    public Boolean getDescontoEmPorcentagem() {
        return descontoEmPorcentagem;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                ", numero=" + numero +
                ", valorFrete=" + valorFrete +
                ", situacao='" + situacao + '\'' +
                ", origem=" + origem +
                ", totalProdutos=" + totalProdutos +
                ", totalVenda=" + totalVenda +
                ", desconto=" + desconto +
                ", loja='" + loja + '\'' +
                ", tipoIntegracao='" + tipoIntegracao + '\'' +
                ", descontoEmPorcentagem=" + descontoEmPorcentagem +
                '}';
    }
}
