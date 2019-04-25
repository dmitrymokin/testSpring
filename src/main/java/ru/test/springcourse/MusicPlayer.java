package ru.test.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();
    private Music music;

    private  String name;
    private int volume;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public Music getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {

    }

    public void playMusic() {
        for (int i=0; i<musicList.size(); i++) {
            System.out.println("Playing: " + musicList.get(i).getSong());
        }
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}

