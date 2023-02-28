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
        return nombreRepository.findAll();
    }

    @Override
    public NombreType getById(int idNombre) {
        try{
            return (NombreType) (nombreRepository.getNombreTypeById(idNombre));
        }catch(Exception e){
            return null; //Mejorar esta excepción
        }
    }

    @Override
    public int putNombre(NombreType nombreType) {
        int ok = 0;
        try{
            nombreRepository.saveAndFlush(nombreType);
            ok = 1;
        }catch (Exception dbSaveError){
            dbSaveError.printStackTrace();
        }
        return ok;
    }

    @Override
    public int deleteById(int id) {
        int ok = 0;
        try {
            nombreRepository.deleteById(id);
            ok = 1;
        }catch (Exception dbSaveError){
            dbSaveError.printStackTrace();
        }
        return ok;
    }

    @Override
    public int getLastId(){
        return nombreRepository.findTopById().getId();
    }
}
