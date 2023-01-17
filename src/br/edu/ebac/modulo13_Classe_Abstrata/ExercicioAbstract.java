package br.edu.ebac.modulo13_Classe_Abstrata;

public class ExercicioAbstract {

    public static void main(String[] args) {

        Pessoa pessoaFisica = new PessoaFisica("Ricardo" , "88767599856");
        Pessoa pessoaJuridica = new PessoaJuridica("Astolfo" , "34356564");

        System.out.println(pessoaFisica);

        System.out.println(pessoaJuridica);



    }
}
