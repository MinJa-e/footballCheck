package com.footballCheck.service.main;


import com.footballCheck.domain.main.MainDTO;
import com.footballCheck.mapper.main.MainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
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
    public MainDTO getRecent_Thumbnail_top_first() {
        return mainMapper.getRecent_Thumbnail_top_first();
    }

    @Override
    public MainDTO getRecent_Thumbnail_top_second() {
        return mainMapper.getRecent_Thumbnail_top_second();
    }

    @Override
    public MainDTO getRecent_Thumbnail_top_third() {
        return mainMapper.getRecent_Thumbnail_top_third();
    }

    @Override
    public MainDTO getRecent_Thumbnail_top_fourth() {
        return mainMapper.getRecent_Thumbnail_top_fourth();
    }

    @Override
    public MainDTO getRecent_Thumbnail_bottom_first() {
        return mainMapper.getRecent_Thumbnail_bottom_first();
    }

    @Override
    public MainDTO getRecent_Thumbnail_bottom_second() {
        return mainMapper.getRecent_Thumbnail_bottom_second();
    }

    @Override
    public MainDTO getRecent_Thumbnail_bottom_third() {
        return mainMapper.getRecent_Thumbnail_bottom_third();
    }

    @Override
    public MainDTO getRecent_Thumbnail_bottom_fourth() {
        return mainMapper.getRecent_Thumbnail_bottom_fourth();
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
//        String filePath = "C:\\Users\\choigy\\Desktop\\afterProject\\footballCheck\\src\\main\\resources\\static\\img\\upload\\";
        String filePath = "/home/hosting_users/leeniesta/tomcat/webapps/ROOT/WEB-INF/classes/static/img/upload";
        String[] fileName = new String[8];

        fileName[0] = mainMapper.getThumbnail_top_first(main_no);
        fileName[1] = mainMapper.getThumbnail_top_second(main_no);
        fileName[2] = mainMapper.getThumbnail_top_third(main_no);
        fileName[3] = mainMapper.getThumbnail_top_fourth(main_no);
        fileName[4] = mainMapper.getThumbnail_bottom_first(main_no);
        fileName[5] = mainMapper.getThumbnail_bottom_second(main_no);
        fileName[6] = mainMapper.getThumbnail_bottom_third(main_no);
        fileName[7] = mainMapper.getThumbnail_bottom_fourth(main_no);

        for(int i=0 ; i<8 ; i++) {
            System.out.println("????????????????????????"+i);
            if(fileName[i] != null){
                File deleteFile = new File(filePath+fileName[i]);
                if(deleteFile.exists()) {

                    // ????????? ???????????????.
                    deleteFile.delete();

                    System.out.println("????????? ?????????????????????.");

                }
            }
        }

        mainMapper.delete(main_no);
    }


}