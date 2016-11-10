package com.codingape.buscab.api.model;

/**
 * Created by rodrigo on 09/11/16.
 */
public class User {

    private String mail;
    private String nombre;
    private String password;


    public User (String mail, String nombre, String password){
        this.mail = mail;
        this.nombre = nombre;
        this.password = password;
    }
}
