package br.edu.ebac.modulo19_reflection;

import br.edu.ebac.modulo18_Annotations.Table;
import br.edu.ebac.modulo18_Annotations.TabelaLinguagens;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflection {

    public static void main(String[] args)  {

        TabelaReflection tabelaReflection = new TabelaReflection();

        final String name = tabelaReflection.getClass().getAnnotation(Tabela.class).annotationType().getSimpleName();



        System.out.println("Nome da classe @annotation: " + name);

    }
}
