package com.example.notification.models;

import java.util.Objects;

public class User {

    private Integer id;
    private String name;
    private String email;
    private String phone;

    public User(Integer id, String name, String email, String phone) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof User user)) return false;

        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {

        return "User{id" + id + ", name = " +
                "}";
    }
}