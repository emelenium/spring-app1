package ru.anton.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
/*
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
*/
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        /*  System.out.println(music.getSong());
        MusicPlayer musicPlayer = new MusicPlayer(music);
        System.out.println(musicPlayer.getVolume());
        Music music2 = context.getBean("rockMusic", RockMusic.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);

        musicPlayer2.playMusic();


        System.out.println(music2.getSong());*/

    //    musicPlayer.playMusicList();

        context.close();

    }
}
