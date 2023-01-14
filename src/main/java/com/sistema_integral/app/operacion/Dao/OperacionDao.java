package com.sistema_integral.app.operacion.Dao;
import org.springframework.data.repository.CrudRepository;
import com.sistema_integral.app.operacion.Model.Operacion;

public interface OperacionDao extends CrudRepository<Operacion, Integer> {
}
