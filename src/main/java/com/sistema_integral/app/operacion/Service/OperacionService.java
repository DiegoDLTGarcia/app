package com.sistema_integral.app.operacion.Service;

import com.sistema_integral.app.operacion.Model.Operacion;
import java.util.List;

public interface OperacionService {
    public List<Operacion> findAll();
    public Operacion save(Operacion operacion);
    public Operacion findById(Integer id);
    public void delete(Integer id);
}
