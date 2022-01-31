package com.footballCheck.domain.main;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MainDTO {

    private int main_no;
    private int main_category;
    private String main_title;
    private String main_content;
    private String main_writer;
    private LocalDateTime main_date;
    private int main_view;
    private int main_like;
    private String main_thumbnail_top_first;
    private String main_thumbnail_top_second;
    private String main_thumbnail_top_third;
    private String main_thumbnail_top_fourth;
    private String main_thumbnail_bottom_first;
    private String main_thumbnail_bottom_second;
    private String main_thumbnail_bottom_third;
    private String main_thumbnail_bottom_fourth;

}
