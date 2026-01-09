package com.xworkz.formpage.dto;

import java.util.Objects;

public class FormpageDTO {
    private String email;
    private String  password;
    private String name;

    @Override
    public String toString() {
        return "FormpageDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FormpageDTO that = (FormpageDTO) o;
        return Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, name);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FormpageDTO(String name, String email, String password) {
      this.name=name;
      this.email=email;
      this.password=password;
    }
}
