package org.example;

public interface PaisOperacao {
    public abstract void iniciarPais();
    public abstract boolean verificarFronteira(Pais pais);
    public abstract void exibirFronteiraComum(Pais pais);
    public abstract double retornarDensidade(Pais pais);
}
