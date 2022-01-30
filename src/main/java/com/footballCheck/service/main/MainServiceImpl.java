package com.footballCheck.service.main;


import com.footballCheck.domain.main.MainDTO;
import com.footballCheck.mapper.main.MainMapper;
import com.footballCheck.pagination.Criteria;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {

    private final MainMapper mainMapper;

    @Override
    public void write(MainDTO mainDTO) {
        mainMapper.write(mainDTO);

    }

    @Override
    public List<MainDTO> getList(HashMap<String, Object> map) {

        return mainMapper.getList(map);
    }

    @Override
    public int countList() {
        return mainMapper.countList();
    }

    @Override
    public MainDTO getContent(int main_no) {
        return mainMapper.getContent(main_no);
    }

    @Override
    public int getPrev(int main_no) {
        return mainMapper.getPrev(main_no);
    }

    @Override
    public int getNext(int main_no) {
        return mainMapper.getNext(main_no);
    }

    @Override
    public int getFirst() {
        return mainMapper.getFirst();
    }

    @Override
    public int getLast() {
        return mainMapper.getLast();
    }

    @Override
    public void updateViewCnt(int main_no) {
        mainMapper.updateViewCnt(main_no);
    }

    @Override
    public void update(MainDTO mainDTO) {
        mainMapper.update(mainDTO);
    }

    @Override
    public void delete(int main_no) {
        mainMapper.delete(main_no);
    }


}