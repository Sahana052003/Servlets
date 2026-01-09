package com.xworkz.spotify.dto;

import java.util.Objects;

public class SpotifyDTO {
    private String email;
    private String password;

    @Override
    public String toString() {
        return "SpotifyDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SpotifyDTO that = (SpotifyDTO) o;
        return Objects.equals(email, that.email) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SpotifyDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
