package com.roberto.censoapi.repository;

import com.roberto.censoapi.types.NombreType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NombreRepository extends JpaRepository<NombreType, Integer> {

    NombreType getNombreTypeById (Integer id);

    List<NombreType> getNombreTypeByNombre (String nombre);

    @Override
    List<NombreType> findAll();
}
