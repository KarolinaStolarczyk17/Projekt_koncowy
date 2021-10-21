package com.example.demo.entity;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "insurance")
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


//    @NotNull
//    @NotBlank
    private int insuranceNumber;

//    @NotNull
//    @NotBlank
    private double insurancePrice;

//    @NotNull
//    @NotBlank
    private boolean isInsuranceActive;

    private String status;

    public Insurance() {

    }
    @ManyToMany
    @NotEmpty
    private List<Client> clientList = new ArrayList<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public boolean isInsuranceActive() {
        return isInsuranceActive;
    }

    public void setInsuranceActive(boolean insuranceActive) {
        isInsuranceActive = insuranceActive;
    }

    public Insurance(long id) {
        this.id = id;
    }

    public Insurance(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public Insurance(double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Insurance(boolean isInsuranceActive) {
        this.isInsuranceActive = isInsuranceActive;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "id=" + id +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", insurancePrice='" + insurancePrice + '\'' +
                ", isInsuranceActive='" + isInsuranceActive + '\'' +
                '}';
    }
}