package com.xworkz.survey.dto;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;

@Data
public class SurveyDTO {
    private int id;
    private String name;
    private double amount;
    private long mobileNumber;

}
