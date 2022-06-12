package com.ans1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist p = new Playlist();
        for(int i=0; i<4; i++) {

            System.out.println("Enter the moviename: ");
            String mo = sc.next();

            System.out.println("Enter the Songname: ");
            String so = sc.next();
            System.out.println("=========================");
            Song s = new Song(mo, so);

            p.addSong(s);
        }
        for(int i=0; i<p.songs.size(); i++){
            p.songs.get(i).pLay();
        }

    }
}
