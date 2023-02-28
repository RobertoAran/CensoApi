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
        Assert.assertEquals(NombreControllerTest.GetAllCensoNames(), 200);
    }

    @Test
    void NombreControllerGetById() {
        Assert.assertEquals(NombreControllerTest.GetNamesById(), 200);
    }
}
