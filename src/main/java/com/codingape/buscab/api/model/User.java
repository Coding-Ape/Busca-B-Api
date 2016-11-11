package com.codingape.buscab.api.model;

/**
 * Created by rodrigo on 09/11/16.
 */
public class User {

    private String id;
    private String mail;
    private String name;
    private String password;


    public User (String id, String mail, String name, String password){
        this.id = id;
        this.mail = mail;
        this.name = name;
        this.password = password;
    }

    public String getId(){
        return id;
    }

    public String getMail(){
        return mail;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
}
