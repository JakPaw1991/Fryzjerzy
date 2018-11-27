package com.persistence.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue
    private Long userId;
    private String name;
    private String lastName;
    private String password;
    private String email;

    public Client() {
        super();
    }

    public Client(Long id, String name, String lastName, String password, String email) {
        this.userId = id;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setUserId(Long id) {
        this.userId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("Client id%d email:%s\n %s %s\n", userId, email, name, lastName);
    }

}
