package br.edu.ebac.modulo17_Generics;

import java.util.ArrayList;
import java.util.List;

public class RepoCarroList<T extends Carro> implements Repositorio<T> {

    private List<T> instance;

    private List<T> getInstance() {

        if (instance == null) instance = new ArrayList<T>();

        return instance;

    }


    @Override
    public void adicionar(T t) {

        this.getInstance().add(t);
    }

    @Override
    public void excluir(T t) {

        this.getInstance().remove(t);

    }

    @Override
    public T buscar(T t) {

        int index = this.getInstance().indexOf(t);
        return this.getInstance().get(index);

    }
}
