package com.roberto.censoapi.controller;

import com.roberto.censoapi.service.NombreService;
import com.roberto.censoapi.types.NombreType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/censo")
public class NombreController {

    @Autowired
    private NombreService nombreService;

    @GetMapping("/all")
    public List<NombreType> getAllCenso() {
        return nombreService.findAll();
    }

    @GetMapping("/{id}")
    public NombreType getById (@PathVariable int id) {
        return nombreService.getById(id);
    }

    @PostMapping("/create/{nombre}")
    public String putNombre(@PathVariable String nombre) {
        NombreType nombreType = new NombreType(nombre);
        nombreType.getValor();

        return (nombreService.putNombre(nombreType) == 1 ? "ok" : "failed");
    }
}
