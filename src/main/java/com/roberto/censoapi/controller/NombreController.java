package com.roberto.censoapi.controller;

import com.roberto.censoapi.service.NombreService;
import com.roberto.censoapi.types.NombreType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
