package org.example;

import java.util.List;

public class Pais {
    private CodigoPais codigo;
    private String nome;
    private long populacao;
    private double dimensao;
    private List<String> fronteiras;

    public Pais(String codigo, String nome, long populacao, double dimensao) {
        this.codigo = CodigoPais.valueOf(codigo.toUpperCase());
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public Pais(){

    }

    public CodigoPais getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = CodigoPais.valueOf(codigo.toUpperCase());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public List<String> getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(List<String> fronteiras) {
        this.fronteiras = fronteiras;
    }
}
