package com.roberto.censoapi.types;

import org.junit.Assert;

public class NombreTypeTest {

    public static void IdTest() {
        NombreType nombreType = new NombreType(1);

        Assert.assertEquals(nombreType.getId(), 1);
    }

    public static void ValorTest() {
        NombreType nombreType = new NombreType("juan");

        Assert.assertEquals(nombreType.getValor(),"juan");
    }
}
