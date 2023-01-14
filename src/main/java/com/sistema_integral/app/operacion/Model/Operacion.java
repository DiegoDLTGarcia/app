package com.sistema_integral.app.operacion.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operacion")
public class Operacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_operacion")
    private int id_operacion;
    @Column (name="nombre_operacion")
    private String nombre_operacion;
    @Column (name="estatus")
    private int estatus;

    public Operacion() {
    }

    public Operacion(int id_operacion, String nombre_operacion, int estatus, String fecha) {
        this.id_operacion = id_operacion;
        this.nombre_operacion = nombre_operacion;
        this.estatus = estatus;
    }

    public int getId_operacion() {
        return id_operacion;
    }

    public void setId_operacion(int id_operacion) {
        this.id_operacion = id_operacion;
    }

    public String getNombre_operacion() {
        return nombre_operacion;
    }

    public void setNombre_operacion(String nombre_operacion) {
        this.nombre_operacion = nombre_operacion;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
}
