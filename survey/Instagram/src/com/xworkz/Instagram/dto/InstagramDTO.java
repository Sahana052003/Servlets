package com.xworkz.Instagram.dto;

import java.util.Objects;

public class InstagramDTO {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String userName;
    private String city;
    private String state;
    private int zip;

    @Override
    public String toString() {
        return "InstagramDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InstagramDTO that = (InstagramDTO) o;
        return zip == that.zip && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(userName, that.userName) && Objects.equals(city, that.city) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, firstName, lastName, userName, city, state, zip);
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public InstagramDTO(String email, String password, String firstName, String lastName, String userName, String city, String state, int zip) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
