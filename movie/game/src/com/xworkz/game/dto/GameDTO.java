package com.xworkz.game.dto;


import lombok.Data;

import javax.servlet.ServletRequest;

@Data
public class GameDTO {
    private int gameId;
    private String noOfPlayers;
    private double price;
    private String userName;
}
