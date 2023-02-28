package com.roberto.censoapi.controller;

import static io.restassured.RestAssured.given;

public class NombreControllerTest {

    public static int GetAllCensoNames() {
        return given().log().all().when().get("/censo/all").getStatusCode();
    }

    public static int GetNamesById() {
        return given().log().all().when().get("/censo/1").getStatusCode();
    }
}
