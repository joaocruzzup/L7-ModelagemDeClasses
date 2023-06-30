package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaisGerenciamento implements PaisOperacao{
    Pais pais1 = new Pais();
    BancoFronteiras bancoFronteiras = new BancoFronteiras();

    @Override
    public void iniciarPais() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do país: ");
        pais1.setCodigo(sc.next());
        sc.nextLine();
        System.out.println("Digite o Nome do país: ");
        pais1.setNome(sc.nextLine());
        System.out.println("Digite a População do país: ");
        pais1.setPopulacao(sc.nextInt());
        System.out.println("Digite a Dimensão do país: ");
        pais1.setDimensao(sc.nextDouble());
    }

    @Override
    public boolean verificarFronteira(Pais pais2) {
        confirmarIniciar();
        bancoFronteiras.gerarFronteiras(pais1);
        List<String> listaFronteira = pais1.getFronteiras();

        return listaFronteira.contains(pais2.getCodigo().toString());
    }

    @Override
    public void exibirFronteiraComum(Pais pais2) {
        confirmarIniciar();
        bancoFronteiras.gerarFronteiras(pais1);
        bancoFronteiras.gerarFronteiras(pais2);

        List<String> listaFronteira1 = pais1.getFronteiras();
        List<String> listaFronteira2 = pais2.getFronteiras();

        List<String> listaFronteirasComum = new ArrayList<>(listaFronteira1);
        listaFronteirasComum.retainAll(listaFronteira2);

        System.out.println("Os países possuem as seguintes fronteiras em comum: ");
        if (listaFronteirasComum.isEmpty()){
            System.out.println("Os países não possuem fronteira em comum");
        }
        for (String codigo:listaFronteirasComum) {
            System.out.println(codigo);
        }
    }

    @Override
    public double retornarDensidade(Pais pais) {
        return pais.getPopulacao() / pais.getDimensao();
    }


    public void confirmarIniciar(){
        if (pais1.getNome() == null && pais1.getCodigo() == null && pais1.getPopulacao() == 0 && pais1.getDimensao() == 0.0){
            iniciarPais();
        }
    }

}
