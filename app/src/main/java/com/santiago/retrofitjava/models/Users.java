package com.santiago.retrofitjava.models;

public class Users {

    Integer id;
    String email;
    String rol ;

    public Users() {
    }

    public Users(Integer id, String email, String rol) {
        this.id = id;
        this.email = email;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
