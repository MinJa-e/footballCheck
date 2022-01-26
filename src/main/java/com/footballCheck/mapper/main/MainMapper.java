package com.footballCheck.mapper.main;


import com.footballCheck.domain.main.MainDTO;
import com.footballCheck.pagination.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MainMapper {

    void write(MainDTO mainDTO);

    List<MainDTO> getList(Criteria criteria);

    int countList();
//
//    MainDTO get(int talkNum);
//
//    void update(MainDTO MainDTO);
//
//    void delete(int talkNum);

}