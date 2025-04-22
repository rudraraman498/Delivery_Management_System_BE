package com.delivery_express_be.Delivery_Express.model;

import ch.qos.logback.core.net.SyslogOutputStream;

public class UserRegisterRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public UserRegisterRequest(String firstname, String lastname, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void seeRequest(){
        System.out.println(this.email);
        System.out.println(this.password);
        System.out.println(this.firstname);
        System.out.println(this.lastname);

    }
}
