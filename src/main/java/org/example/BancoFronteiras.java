package org.example;

import java.util.ArrayList;
import java.util.List;

public class BancoFronteiras {
    // Fronteiras a serem geradas ARG, BOL, BRA ,CHL, COL, ECU, GUY, PRY, PER, SUR, URY, VEN;

    public void gerarFronteiras(Pais pais){
        List<String> fronteiras = new ArrayList<>();
        switch (pais.getCodigo()){
            case ARG:
                fronteiras.add("BOL");
                fronteiras.add("BRA");
                fronteiras.add("CHL");
                fronteiras.add("PRY");
                fronteiras.add("URY");
                break;
            case BOL:
                fronteiras.add("ARG");
                fronteiras.add("BRA");
                fronteiras.add("CHL");
                fronteiras.add("PRY");
                fronteiras.add("PER");
                break;
            case BRA:
                fronteiras.add("ARG");
                fronteiras.add("BOL");
                fronteiras.add("COL");
                fronteiras.add("GUY");
                fronteiras.add("PRY");
                fronteiras.add("PER");
                fronteiras.add("SUR");
                fronteiras.add("URY");
                break;
            case CHL:
                fronteiras.add("ARG");
                fronteiras.add("BOL");
                fronteiras.add("PER");
                break;
            case COL:
                fronteiras.add("BRA");
                fronteiras.add("PER");
                fronteiras.add("ECU");
                break;
            case ECU:
                fronteiras.add("COL");
                fronteiras.add("PER");
                break;
            case GUY:
                fronteiras.add("BRA");
                fronteiras.add("SUR");
                break;
            case PRY:
                fronteiras.add("ARG");
                fronteiras.add("BOL");
                fronteiras.add("BRA");
                break;
            case PER:
                fronteiras.add("BOL");
                fronteiras.add("BRA");
                fronteiras.add("COL");
                fronteiras.add("ECU");
                fronteiras.add("CHL");
                fronteiras.add("SUR");
                break;
            case SUR:
                fronteiras.add("BRA");
                fronteiras.add("GUY");
                break;
            case URY:
                fronteiras.add("ARG");
                fronteiras.add("BRA");
                break;
            case VEN:
                fronteiras.add("BRA");
                break;
            default:
                // Tratar um caso inválido, se necessário
                break;
        }
        pais.setFronteiras(fronteiras);
    }
}
