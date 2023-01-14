package com.sistema_integral.app.operacion.Service;

import com.sistema_integral.app.operacion.Dao.OperacionDao;
import com.sistema_integral.app.operacion.Model.Operacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OperacionServiceImplemet implements OperacionService{
    @Autowired
    private OperacionDao operacionDao;

    @Override
    @Transactional(readOnly=true)
    public List<Operacion> findAll()
    {
        return (List<Operacion>) operacionDao.findAll();
    }

    @Override
    @Transactional(readOnly=false)
    public Operacion save(Operacion operacion)
    {
        return operacionDao.save(operacion);
    }

    @Override
    @Transactional(readOnly=true)
    public Operacion findById(Integer id)
    {
        return operacionDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        operacionDao.deleteById(id);
    }
}
