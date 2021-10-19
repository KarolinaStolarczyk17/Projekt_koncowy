package com.example.demo.entity;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String password;
    private String email;


    public User (String userName, String password, String email){
        this.userName=userName;
        this.password=password;
        this.email=email;
    }

    public User() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public long getId() {
        return id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                "userName=" + userName +
                "password=" + password +
                ", email='" + email + '\'' +
                '}';
    }
}