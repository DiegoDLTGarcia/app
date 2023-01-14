package com.sistema_integral.app.operacion.Controller;

import com.sistema_integral.app.operacion.Model.Operacion;
import com.sistema_integral.app.operacion.Service.OperacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class OperacionController {
    @Autowired
    private OperacionService operacionService;                       

    //Listar operaciones
    @GetMapping("/operaciones")
    public List<Operacion> listar(){
        return operacionService.findAll();
    }

    //Guardar Operacion
    @PostMapping("/operacionesSave")
    public Operacion save(@RequestBody Operacion operacion){
        return operacionService.save(operacion);
    }

    //Optiene la operacion en base a un id
    @GetMapping("/operacion/{id}")
    public Operacion getOperacion(@PathVariable int id){
        return operacionService.findById(id);
    }

    //Modificar operacion
    @PutMapping("/updateoperacion/{id}")
    public Operacion update(@RequestBody Operacion operacion,@PathVariable int id){
        Operacion operacionActual=operacionService.findById(id);
        operacionActual.setId_operacion(operacion.getId_operacion());
        operacionActual.setNombre_operacion(operacion.getNombre_operacion());
        operacionActual.setEstatus(operacion.getEstatus());


        return operacionService.save(operacionActual);
    }

    //Eliminar Operacion
    @DeleteMapping("/deleteoperacion/{id}")
    public void delete(@PathVariable int id){
        operacionService.delete(id);
    }
}
