package br.edu.ebac.modulo17_Generics;

public interface Repositorio<T> {

    void adicionar(T t);

    void excluir(T t);

    T buscar(T t);


}
