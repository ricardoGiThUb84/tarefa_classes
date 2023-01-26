package br.edu.ebac.modulo18_Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppAnnotations {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TabelaLinguagens tabela = new TabelaLinguagens();

        final Method[] declaredMethods = tabela.getClass().getDeclaredMethods();

        for (Method metodo:declaredMethods) {

            final boolean annotationPresent = metodo.isAnnotationPresent(Table.class);
            if(annotationPresent){
                final String nome = metodo.getAnnotation(Table.class).nome();
                System.out.println("-----" + nome + "-----");
                metodo.invoke(tabela);
            }

        }
    }
}
