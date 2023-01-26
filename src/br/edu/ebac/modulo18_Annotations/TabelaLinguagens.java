package br.edu.ebac.modulo18_Annotations;

public class TabelaLinguagens {

    @Tabela(nome = "Fracamente Tipadas")
    public void linguagemInterpretada(){

        System.out.println("javascript");
        System.out.println("python");
    }

    @Tabela(nome = "Tipadas")
    public void linguagemCompilada(){

        System.out.println("java");
        System.out.println("c");
    }
}
