package com.codingape.buscab.api.model;

public class Bar {

    protected String id;

    protected String name;

    protected String description;

    protected String address;

    public Bar(String id, String name, String description, String address) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

}
