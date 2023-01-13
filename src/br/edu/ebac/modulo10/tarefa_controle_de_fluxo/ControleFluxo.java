package br.edu.ebac.modulo10.tarefa_controle_de_fluxo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleFluxo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        System.out.println("Digite as 4 notas do aluno: ");
        for(int i = 0; i < 4; i++){
            int posicao = i + 1;
            System.out.println("Digite a nota("+ posicao + ").");
            notas.add(scan.nextDouble());
        }
        scan.close();

        Double media = notas.stream().reduce((total, nota) -> total += nota).get() / notas.size();

        //maior ou igual a 7 aprovado
        // maior igual a 5 e menor 7 recuperacao
        //menor 5 reprovado

        System.out.println("A média do aluno é: " + media);

        if(media >= 7 ) System.out.println("Aprovado");
        if(media >= 5 && media < 7 ) System.out.println("Recuperação");
        if(media  < 5 ) System.out.println("Reprovado");

    }
}
