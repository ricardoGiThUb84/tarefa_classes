package br.edu.ebac.modulo18_Annotations;

public class TabelaLinguagens {

    @Table(nome = "Fracamente Tipadas")
    public void linguagemInterpretada(){

        System.out.println("javascript");
        System.out.println("python");
    }

    @Table(nome = "Tipadas")
    public void linguagemCompilada(){

        System.out.println("java");
        System.out.println("c");
    }
}
