package com.xworkz.ownly.dto;

import java.util.Objects;

public class OwnlyDTO {
    private String name;
    private String email;
    private String mobileNumber;
    private Integer age;

    public String getName() {
        return name;
    }

    public OwnlyDTO(String name, String email, String mobileNumber, Integer age) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "OwnlyDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OwnlyDTO ownlyDTO = (OwnlyDTO) o;
        return Objects.equals(name, ownlyDTO.name) && Objects.equals(email, ownlyDTO.email) && Objects.equals(mobileNumber, ownlyDTO.mobileNumber) && Objects.equals(age, ownlyDTO.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, mobileNumber, age);
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
