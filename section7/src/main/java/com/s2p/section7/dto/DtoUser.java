package com.s2p.section7.dto;

public class DtoUser {

    private String name;
    private long id;
    private String email;

    public DtoUser(){

    }

    public DtoUser(String name, long id, String email) {

        this.name = name;
        this.id = id;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
