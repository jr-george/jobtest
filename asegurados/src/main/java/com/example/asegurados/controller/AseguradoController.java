package com.example.asegurados.controller;

import com.example.asegurados.model.*;
import com.example.asegurados.service.AseguradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/asegurados")
public class AseguradoController {
    @Autowired
    private AseguradoService aseguradoService;

    @GetMapping
    public List<Asegurado> getAllAsegurados()
    {
        return aseguradoService.getAllAsegurados();
    }
}
