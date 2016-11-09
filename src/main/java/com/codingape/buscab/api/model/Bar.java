package com.codingape.buscab.api.model;

public class Bar {

    private Integer id;
    private String nombre;
    private String direccion;
    private Float rating;
    private String descripcion;

    public Bar (Integer id, String nombre, String direccion, Float rating, String descripcion){
        this.id=id;
        this.nombre=nombre;
        this.direccion=direccion;
        this.rating=rating;
        this.descripcion=descripcion;
    }

    public Integer getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Float getRating() {
        return rating;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
