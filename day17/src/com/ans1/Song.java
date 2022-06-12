package com.ans1;

import java.util.Objects;

public class Song {
    private String moviename;
    private String songname;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(moviename, song.moviename) && Objects.equals(songname, song.songname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moviename, songname);
    }

    public Song(String moviename, String songname) {
        this.moviename = moviename;
        this.songname = songname;
    }

   void pLay(){
       System.out.println(songname+" of "+moviename+" is playing....!");
   }
   Song(){

   }

}
