package com.devsuperior.dscomerce.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String passwod;

    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<>();

    public User () {

    }

    public User(Long id, String name, String email, String phone, LocalDate birthDate, String passwod) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.passwod = passwod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPasswod() {
        return passwod;
    }


    public void setPasswod(String passwod) {
        this.passwod = passwod;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
