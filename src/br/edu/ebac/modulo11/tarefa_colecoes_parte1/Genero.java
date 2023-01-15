package br.edu.ebac.modulo11.tarefa_colecoes_parte1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Genero {

    public static void main(String[] args) {
        List<String> generoMasculino = new ArrayList<>();
        List<String> generoFeminino = new ArrayList<>();

        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Digite o nome da pessoa e o gênero: Ex: \'Camila-F\'");
            System.out.println("Para sair, digite - ( S )");
            String[] verificaGenero = scan.next().split("-");
            if (verificaGenero[0].equalsIgnoreCase("s")) break;

            String nome = verificaGenero[0];
            String genero = verificaGenero[1];

            if (genero.equalsIgnoreCase("f")) generoFeminino.add(nome);
            else generoMasculino.add(nome);
        } while (true);

        scan.close();

        System.out.println("Nomes gênero masculino: ");
        for (String generoM : generoMasculino) {
            System.out.println(generoM);
        }

        System.out.println("Nomes gênero feminino: ");
        for (String generoF : generoFeminino) {
            System.out.println(generoF);
        }
    }
}
