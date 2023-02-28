package com.roberto.censoapi.controller;

import static io.restassured.RestAssured.given;

public class NombreControllerTest {

    public static int getAllCensoValor() {
        return given().log().all().when().get("/censo/all").getStatusCode();
    }

    public static int getValorById() {
        return given().log().all().when().get("/censo/1").getStatusCode();
    }
    public static int putNamesByValor() {
        return given().log().all().when().post("/censo/create/german").getStatusCode();
    }
    public static int deleteNombre() {
        return given().log().all().when().delete("/censo/create/Delete/1").getStatusCode();
    }
}
