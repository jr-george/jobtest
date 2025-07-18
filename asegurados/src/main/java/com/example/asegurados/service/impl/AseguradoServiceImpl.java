package com.example.asegurados.service.impl;
import com.example.asegurados.model.*;
import com.example.asegurados.repository.AseguradoRepository;
import com.example.asegurados.service.AseguradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AseguradoServiceImpl implements AseguradoService {
    @Autowired
    private AseguradoRepository aseguradoRepository;
    @Override
    public List<Asegurado> getAllAsegurados() {
        return aseguradoRepository.getAsegurados();
    }

    //@Override
    /*public Optional<Asegurado> getAseguradoByPoliza(long poliza) {
        return aseguradoRepository.getAseguradoByPoliza(poliza);
    }*/
}
