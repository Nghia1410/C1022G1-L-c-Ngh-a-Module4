package com.example.music.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MusicDTO {
    private int id;
    @NotBlank(message = "không được để trống")
    @Size(min = 4, max = 15, message = "tên bài hát phải dài ít nhất 4 và nhiều nhất là 15 ký tự ")
    private String name;
    @NotBlank(message = "không được để trống")
    @Size(min = 4, max = 15, message = "tên ca sĩ phải dài ít nhất 4 và nhiều nhất là 15 ký tự ")
    private String singer;
    @NotBlank(message = "không được để trống")
    @Size(min = 3, max = 15, message = "tên thể loại phải dài ít nhất 3 và nhiều nhất là 15 ký tự ")
    private String type;

    public MusicDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
