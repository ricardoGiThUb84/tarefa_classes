package br.edu.ebac.modulo13_Classe_Abstrata;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
