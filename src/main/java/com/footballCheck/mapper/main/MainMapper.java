package com.footballCheck.mapper.main;


import com.footballCheck.domain.main.MainDTO;
import com.footballCheck.pagination.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;


@Mapper
public interface MainMapper {

    void write(MainDTO mainDTO);

    List<MainDTO> getList(HashMap<String, Object> map);

    int countList();

    MainDTO getContent(int main_no);

    int getPrev(int main_no);

    int getNext(int main_no);

    int getFirst();

    int getLast();

    String getThumbnail_top_first(int main_no);
    String getThumbnail_top_second(int main_no);
    String getThumbnail_top_third(int main_no);
    String getThumbnail_top_fourth(int main_no);
    String getThumbnail_bottom_first(int main_no);
    String getThumbnail_bottom_second(int main_no);
    String getThumbnail_bottom_third(int main_no);
    String getThumbnail_bottom_fourth(int main_no);

    MainDTO getRecent_Thumbnail_top_first();
    MainDTO getRecent_Thumbnail_top_second();
    MainDTO getRecent_Thumbnail_top_third();
    MainDTO getRecent_Thumbnail_top_fourth();
    MainDTO getRecent_Thumbnail_bottom_first();
    MainDTO getRecent_Thumbnail_bottom_second();
    MainDTO getRecent_Thumbnail_bottom_third();
    MainDTO getRecent_Thumbnail_bottom_fourth();

    void updateViewCnt(int main_no);

    void update(MainDTO MainDTO);

    void delete(int talkNum);

}