package com.xworkz.facebooklogin.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class FacebookDTO {
private String name;
private Integer age;
private String password;
private String confirmPassword;
private String email;

}
