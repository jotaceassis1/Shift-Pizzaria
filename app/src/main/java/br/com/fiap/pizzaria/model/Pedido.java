package br.com.fiap.pizzaria.model;

import java.util.List;

public class Pedido {

    private List<String> sabor;
    private String tamanho;
    private String tipoPagamento;

    public List<String> getSabor() {
        return sabor;
    }

    public void setSabor(List<String> sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}