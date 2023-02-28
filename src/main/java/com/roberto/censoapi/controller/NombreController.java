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

    @GetMapping("/lastId")
    public int getLastId() {
        return nombreService.getLastId();
    }

    @PostMapping("/create/{nombre}")
    public String putNombre(@PathVariable String nombre) {
        NombreType nombreType = new NombreType(nombre);

        return (nombreService.putNombre(nombreType) == 1 ? "ok" : "failed");
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteById(@PathVariable int id) {
        return (nombreService.deleteById(id) == 1 ? "ok" : "failed");
    }
}
