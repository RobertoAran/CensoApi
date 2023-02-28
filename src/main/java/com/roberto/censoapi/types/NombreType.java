package com.roberto.censoapi.types;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NOMBRE")
public class NombreType {

    @Id
    private int Id;

    private String Valor;

    public NombreType(int id, String valor) {
        Id = id;
        Valor = valor;
    }

    public NombreType(String valor) {
        Valor = valor;
    }

    public NombreType(int id) {
        Id = id;
    }

    public NombreType() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }
}
