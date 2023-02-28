package com.roberto.censoapi.repository;

import com.roberto.censoapi.types.NombreType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NombreRepository extends JpaRepository<NombreType, Integer> {

    @Override
    List<NombreType> findAll();

    NombreType getNombreTypeById (Integer id);

    NombreType findTopById();
}
