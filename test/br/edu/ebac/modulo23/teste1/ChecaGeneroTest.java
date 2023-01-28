package br.edu.ebac.modulo23.teste1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChecaGeneroTest {

    @Test
    public void checaSeExisteNomesFemininos() {

        String entreda = "Apolo-M,Athena-F,Zeus-M,Hera-F,Hermes-M";

        String[] valorEsperado = {"Athena", "Hera"};
        String[] valor = ChecaGenero.criaListaNomesFemininos(entreda);

        Assert.assertArrayEquals(valorEsperado, valor);
    }
}