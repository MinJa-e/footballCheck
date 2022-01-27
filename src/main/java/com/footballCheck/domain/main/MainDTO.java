package com.footballCheck.domain.main;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MainDTO {

    private int main_no;
    private int main_category;
    private String main_title;
    private String main_content;
    private String main_thumbnail;
    private String main_writer;
    private LocalDateTime main_date;
    private int main_view;
    private int main_like;

}
