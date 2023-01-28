package br.edu.ebac.modulo23.teste1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChecaGenero {

    public static String[] criaListaNomesFemininos(String nomes) {

        String[] listaNomes = nomes.split(",");

        final List<String> f = Arrays.stream(listaNomes)
                .filter(nome -> nome.split("-")[1].equalsIgnoreCase("F"))
                .map(nomesFemininos -> nomesFemininos.split("-")[0]).collect(Collectors.toList());

        String[] nomesFemininos = new String[f.size()];

        for (int i = 0; i < nomesFemininos.length; i++) nomesFemininos[i] = f.get(i);

        return nomesFemininos;

    }
}
