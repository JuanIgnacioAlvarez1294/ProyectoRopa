package com.miapp.controller;

import com.miapp.model.Ropa;
import com.miapp.repository.RopaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RopaController {

    @Autowired
    private RopaRepository ropaRepository;

    @PostMapping("/ropa")
    public Ropa guardarRopa(@RequestBody Ropa ropa) {
        return ropaRepository.save(ropa);
    }
}
