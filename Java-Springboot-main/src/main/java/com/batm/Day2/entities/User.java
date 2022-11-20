package com.batm.Day2.entities;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    /*
    id
    fullname
    email
    password
    roleld
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String email;
    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    public User() {

    }

    public User(String username,String password, Role role){
        this.setUsername(username);
        this.setPassword(password);
        this.setRole(role);
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public com.batm.Day2.entities.Role getRole() {
        return role;
    }

    public void setRole(com.batm.Day2.entities.Role role) {
        this.role = role;
    }
}

