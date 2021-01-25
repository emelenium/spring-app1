package ru.anton.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier ("musicBean")
    private Music music;

    public String playMusic(){
        return "Playing: "+ music.getSong();

    }
}
