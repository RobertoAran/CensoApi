package com.roberto.censoapi;

import com.roberto.censoapi.controller.NombreControllerTest;
import com.roberto.censoapi.types.NombreTypeTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NombreTest {

    @Test
    void NombreTypeIdTest(){
        NombreTypeTest.IdTest();
    }

    @Test
    void CensoTypeNameTest() {
        NombreTypeTest.ValorTest();
    }
    @Test
    void NombreControllerGetAll() {
        Assert.assertEquals(NombreControllerTest.getAllCensoValor(), 200);
    }

    @Test
    void NombreControllerGetById() {
        Assert.assertEquals(NombreControllerTest.getValorById(), 200);
    }

    @Test
    void nombreControllerPutByName() {
        Assert.assertEquals(NombreControllerTest.putNamesByValor(), 200);
    }

    @Test
    void nombreControllerDeleteById() {
        Assert.assertEquals(NombreControllerTest.deleteNombre(), 200);
    }
}
