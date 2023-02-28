package com.roberto.censoapi.service;

import com.roberto.censoapi.repository.NombreRepository;
import com.roberto.censoapi.types.NombreType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NombreServiceImpl implements NombreService{

    @Autowired
    private NombreRepository nombreRepository;

    @Override
    public List<NombreType> findAll() {
        List <NombreType> nombreType = nombreRepository.findAll();
        return nombreType;
    }

    @Override
    public NombreType getById(int idNombre) {
        try{
            return (NombreType) (nombreRepository.getNombreTypeById(idNombre));
        }catch(Exception e){
            return null; //Mejorar esta excepción
        }
    }
}
