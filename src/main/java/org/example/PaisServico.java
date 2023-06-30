package org.example;

public class PaisServico {

    private PaisOperacao paisServico;

    public PaisServico(PaisOperacao paisServico) {
        this.paisServico = paisServico;
    }

    public void exibirFronteiraComum(Pais pais){
        paisServico.exibirFronteiraComum(pais);
    }

    public boolean verificarFronteira(Pais pais){
        return paisServico.verificarFronteira(pais);
    }

    public double retornarDimensao(Pais pais){
        return paisServico.retornarDensidade(pais);
    }

}
