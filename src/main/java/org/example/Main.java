package org.example;


public class Main {
    public static void main(String[] args) {
        PaisOperacao paisOperacao = new PaisGerenciamento();
        PaisServico paisServico = new PaisServico(paisOperacao);

        Pais brasil = new Pais("BRA", "Brasil", 11111111, 888888880);
        Pais argentina = new Pais("ARG", "Argentina", 11111111, 888888880);
        Pais bolivia = new Pais("BOL", "Bolívia", 11111111, 888888880);


        System.out.println(paisServico.verificarFronteira(argentina));
        paisServico.exibirFronteiraComum(bolivia);
        System.out.println(paisServico.retornarDimensao(brasil));
    }
}