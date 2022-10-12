package br.com.metalumens.relatoriosapp.models.entities;

public class Produto {
    private final String codigo;
    private final String descricao;
    private final Double quantidade;
    private final Double valorUnitario;
    private final Double descontoItem;
    private final Double precoCusto;

    public Produto(String codigo, String descricao, Double quantidade, Double valorUnitario, Double descontoItem, Double precoCusto) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.descontoItem = descontoItem;
        this.precoCusto = precoCusto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public Double getDescontoItem() {
        return descontoItem;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                ", descontoItem=" + descontoItem +
                ", precoCusto=" + precoCusto +
                '}';
    }
}
