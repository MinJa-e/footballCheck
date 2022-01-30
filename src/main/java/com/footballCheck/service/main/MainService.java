package com.footballCheck.service.main;


import com.footballCheck.domain.main.MainDTO;
import com.footballCheck.pagination.Criteria;

import java.util.HashMap;
import java.util.List;

public interface MainService {

    void write(MainDTO mainDTO);

    List<MainDTO> getList(HashMap<String, Object> map);

    int countList();

    MainDTO getContent(int main_no);

    int getPrev(int main_no);

    int getNext(int main_no);

    int getFirst();

    int getLast();

    void updateViewCnt(int main_no);

    void update(MainDTO mainDTO);

    void delete(int talkNum);

}