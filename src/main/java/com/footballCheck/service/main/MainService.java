package com.footballCheck.service.main;


import com.footballCheck.domain.main.MainDTO;
import com.footballCheck.pagination.Criteria;

import java.util.List;

public interface MainService {

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