package com.footballCheck.domain.main;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MainDTO {

    private int no;
    private int category;
    private String title;
    private String content;
    private String thumbnail;
    private String writer;
    private LocalDateTime date;
    private int view;
    private int good;

}
