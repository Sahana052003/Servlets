package com.xworkz.spotify.service;

import com.xworkz.spotify.dto.SpotifyDTO;

public class SpotifyService {
    public boolean check(SpotifyDTO spotifyDTO) {
        if(spotifyDTO.getEmail()!=null&&spotifyDTO.getPassword().length() >= 6){
            return true;
    }
    return false;
}
}
