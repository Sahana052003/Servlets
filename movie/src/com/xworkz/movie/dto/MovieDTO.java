package com.xworkz.movie.dto;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class MovieDTO {
    private int id;
    private String name;
    private double price;
    private String movieName;

}
