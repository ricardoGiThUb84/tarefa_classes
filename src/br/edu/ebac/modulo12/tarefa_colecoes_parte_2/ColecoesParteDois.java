package br.edu.ebac.modulo12.tarefa_colecoes_parte_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ColecoesParteDois {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite nomes das pessoas separadas por vírgula.");

        String[] nomes = scan.next().split(",");

        System.out.println("Os nomes digitados são: ");
        Arrays.stream(nomes).sorted(Comparator.naturalOrder()).forEach(System.out::println);

        scan.close();


    }
}
