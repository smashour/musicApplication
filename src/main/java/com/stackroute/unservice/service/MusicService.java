package com.stackroute.unservice.service;

import com.stackroute.unservice.domain.Music;
import com.stackroute.unservice.exceptions.MusicAlreadyExistException;
import com.stackroute.unservice.exceptions.MusicIdNotFoundException;
import com.stackroute.unservice.exceptions.MusicNotFoundException;

import java.util.List;

public interface MusicService {

    public Music saveMusic(Music music) throws MusicAlreadyExistException;

    public List<Music> getAllMusics();

    public void deleteMusic(int id);

    Music updateComment(Music music) throws MusicIdNotFoundException;

    List<Music> getMusicByName(String name) throws MusicNotFoundException;

    public void seedData(Music music);
}
