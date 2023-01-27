package br.edu.ebac.modulo22_Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<String> listaPessoas = new ArrayList<>();


        Scanner scan = new Scanner(System.in);


        System.out.println("Digite os nomes das pessoa e o gênero: Ex: \'Camila-F,Pedro-M\'");
        String[] lista = scan.next().split(",");

        listaPessoas.addAll(Arrays.asList(lista));

        scan.close();

        System.out.println(listaPessoas);


        List<String> mulheres = listaPessoas.stream()
                .filter(pessoa -> pessoa.split("-")[1].equalsIgnoreCase("F"))
                .map(nomes -> nomes.split("-")[0])
                .collect(Collectors.toList());


        System.out.println("Nomes gênero feminino: ");
        System.out.println(mulheres);

    }
}
