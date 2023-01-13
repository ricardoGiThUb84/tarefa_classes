package br.edu.ebac.modulo9.tarefa_wrapper;

public class ExercicioWrapper {

    public static void main(String[] args) {

        int diasDoAno = 365;

        Integer quantidadeDiasAno = diasDoAno;

        long quantidadeHorasAno = 8760;

        int horasNoAno = (int) quantidadeHorasAno;

        System.out.println("Auto Boxing para classe wrapper: " + quantidadeDiasAno);

        System.out.println("Cast Explicito: " + horasNoAno);
    }
}