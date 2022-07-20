package com.example.Rs1.RS1;

import org.springframework.stereotype.Component;

@Component
public class Usuario {
  private String nombre;
  private String id;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "nombre = " + nombre +
                "id = " + id
               ;
    }
}

