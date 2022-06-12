package com.ans1;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    public List<Song> songs = new ArrayList<>();
    public void addSong(Song song){
        if(songs.contains(song)){
            System.out.println("Song is already added in the playlist");
        }
        else{
            songs.add(song);
            System.out.println("Song successfully added to the playlist");
        }
    }
}
