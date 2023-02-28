package com.roberto.censoapi.service;

import com.roberto.censoapi.types.NombreType;

import java.util.List;

public interface NombreService {
    List<NombreType> findAll();

    NombreType getById(int idNombre);

    int putNombre(NombreType nombreType);

    int deleteById(int id);
}
