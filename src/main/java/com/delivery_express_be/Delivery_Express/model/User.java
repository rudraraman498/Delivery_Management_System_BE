package com.delivery_express_be.Delivery_Express.model;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
    private String firstname;
    private String lastname;
    private String email;
    private String passwordhash;
    private String phonenumber;
    private String usertype;
    private String oauthprovider;
    @Column(name = "createdat", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String createdat;
    @Column(name = "updatedat", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private String updatedat;

    public User(){}

    public User(String firstname, String lastname, String email, String passwordhash) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.passwordhash = passwordhash;
    }

    public User(String firstname, String lastname, String email, String passwordhash, String phonenumber, String usertype, String oauthprovider, String createdate, String updatedate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.passwordhash = passwordhash;
        this.phonenumber = phonenumber;
        this.usertype = usertype;
        this.oauthprovider = oauthprovider;


        this.createdat = createdate;
        this.updatedat = updatedate;
    }

    public User(int userid, String firstname, String lastname, String email, String passwordhash, String phonenumber, String usertype, String oauthprovider, String createdate, String updatedate) {
        this.userid = userid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.passwordhash = passwordhash;
        this.phonenumber = phonenumber;
        this.usertype = usertype;
        this.oauthprovider = oauthprovider;
        this.createdat = createdate;
        this.updatedat = updatedate;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public String getPasswordhash() {
        return passwordhash;
    }

    public void setPasswordhash(String passwordhash) {
        this.passwordhash = passwordhash;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getOauthprovider() {
        return oauthprovider;
    }

    public void setOauthprovider(String oauthprovider) {
        this.oauthprovider = oauthprovider;
    }

    public String getCreatedate() {
        return createdat;
    }

    public void setCreatedate(String createdate) {
        this.createdat = createdate;
    }

    public String getUpdatedate() {
        return updatedat;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedat = updatedate;
    }
}
