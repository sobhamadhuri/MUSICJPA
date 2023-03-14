//Interface maintains consistency and abstraction



package com.example.song.repository;

import com.example.song.model.Song;
import java.util.*;

public interface SongRepository{
    ArrayList<Song> getSongs(); //Declaring abstract methods
    Song addSong(Song song);
    Song getSongById(int songId);
    Song updateSong(int songId, Song song);
    void deleteSong(int songId);
}
