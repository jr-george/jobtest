package com.example.asegurados.repository;

import org.springframework.stereotype.Repository;
import com.example.asegurados.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AseguradoRepository {

    private List<Asegurado> lstAsegurados;

    public AseguradoRepository()
    {

        lstAsegurados=new ArrayList<Asegurado>();

        Asegurado asegurado1= new Asegurado(1,123456, "Jorge", "Jarillo", "Sanchez",
                "jarillo.jr@gmail.com", "5574513984",
                new Direccion(1,"La Coruña", "74", "Alamos", "CDMX"));

        Asegurado asegurado2 = new Asegurado(2,78901234, "Patricia", "Garcia", "Ortiz",
                "pgo7502@gmail.com", "55123456",
                new Direccion(2,"Rio Danubio", "116", "Cuauhtemoc", "CDMX"));
        Asegurado asegurado3=new Asegurado(3,10293847, "Julio", "Menchaza", "Salazar",
                "julio.menchaca@hidalgo.gob.mx", "7717142000",
                new Direccion(3,"Plaza Juárez", "S/N", "Centro", "Pachuca"));

        lstAsegurados.add(asegurado1);
        lstAsegurados.add(asegurado2);
        lstAsegurados.add(asegurado3);
    }

    public List<Asegurado> getAsegurados()
    {

        return lstAsegurados;
    }
    
    public Optional<Asegurado> getAseguradoByPoliza(long poliza)
    {
        return lstAsegurados.stream()
                .filter(p->p.getNumPoliza()==poliza)
                .findFirst();
    }
}
