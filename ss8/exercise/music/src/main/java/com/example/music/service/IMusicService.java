package com.example.music.service;

import com.example.music.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void create(Music music);

    void edit(Music music);

    Music findById(int id);
}
