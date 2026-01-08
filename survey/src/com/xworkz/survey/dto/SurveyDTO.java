package com.xworkz.survey.dto;

import java.util.Objects;

public class SurveyDTO {
    private String firstName;
    private String name;
    private String email;
    private String password;
    private String address;
    private String city;
    private String state;
    private int zip;
    private boolean check;

    @Override
    public String toString() {
        return "SurveyDTO{" +
                "firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", check=" + check +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SurveyDTO surveyDTO = (SurveyDTO) o;
        return zip == surveyDTO.zip && check == surveyDTO.check && Objects.equals(firstName, surveyDTO.firstName) && Objects.equals(name, surveyDTO.name) && Objects.equals(email, surveyDTO.email) && Objects.equals(password, surveyDTO.password) && Objects.equals(address, surveyDTO.address) && Objects.equals(city, surveyDTO.city) && Objects.equals(state, surveyDTO.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, name, email, password, address, city, state, zip, check);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public SurveyDTO(String firstName, String name, String email, String password, String address, String city, String state, int zip, boolean check) {
        this.firstName = firstName;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.check = check;
    }
}
