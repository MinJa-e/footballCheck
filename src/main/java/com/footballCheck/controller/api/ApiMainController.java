package com.footballCheck.controller.api;

import com.footballCheck.domain.main.MainDTO;
import com.footballCheck.service.main.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/api/main")
@RequiredArgsConstructor
public class ApiMainController {

    private final MainService mainService;

    @PostMapping
    public String write(@RequestParam(value="top_first", required = false) MultipartFile top_first
            , @RequestParam(value="top_second", required = false) MultipartFile top_second
            , @RequestParam(value="top_third", required = false) MultipartFile top_third
            , @RequestParam(value="top_fourth", required = false) MultipartFile top_fourth
            , @RequestParam(value="bottom_first", required = false) MultipartFile bottom_first
            , @RequestParam(value="bottom_second", required = false) MultipartFile bottom_second
            , @RequestParam(value="bottom_third", required = false) MultipartFile bottom_third
            , @RequestParam(value="bottom_fourth", required = false) MultipartFile bottom_fourth
            , MainDTO mainDTO) throws IOException {

        String uuid = UUID.randomUUID().toString();
        if(!top_first.isEmpty()){
            String top_first_fileName = top_first.getOriginalFilename();
            String fullFileName = uuid+"_"+top_first_fileName;
            File saveTopFirstFileName = new File(fullFileName);
            top_first.transferTo(saveTopFirstFileName);
            mainDTO.setMain_thumbnail_top_first(fullFileName);
        }
        if(!top_second.isEmpty()){
            String top_second_fileName = top_second.getOriginalFilename();
            String fullFileName = uuid+"_"+top_second_fileName;
            File saveTopFirstFileName = new File(fullFileName);
            top_second.transferTo(saveTopFirstFileName);
            mainDTO.setMain_thumbnail_top_second(fullFileName);
        }
        if(!top_third.isEmpty()){
            String top_third_fileName = top_third.getOriginalFilename();
            String fullFileName = uuid+"_"+top_third_fileName;
            File saveTopFirstFileName = new File(fullFileName);
            top_third.transferTo(saveTopFirstFileName);
            mainDTO.setMain_thumbnail_top_third(fullFileName);
        }
        if(!top_fourth.isEmpty()){
            String top_fourth_fileName = top_fourth.getOriginalFilename();
            String fullFileName = uuid+"_"+top_fourth_fileName;
            File saveTopFirstFileName = new File(fullFileName);
            top_fourth.transferTo(saveTopFirstFileName);
            mainDTO.setMain_thumbnail_top_fourth(fullFileName);
        }
        if(!bottom_first.isEmpty()){
            String bottom_first_fileName = bottom_first.getOriginalFilename();
            String fullFileName = uuid+"_"+bottom_first_fileName;
            File savebottomFirstFileName = new File(fullFileName);
            bottom_first.transferTo(savebottomFirstFileName);
            mainDTO.setMain_thumbnail_bottom_first(fullFileName);
        }
        if(!bottom_second.isEmpty()){
            String bottom_second_fileName = bottom_second.getOriginalFilename();
            String fullFileName = uuid+"_"+bottom_second_fileName;
            File savebottomFirstFileName = new File(fullFileName);
            bottom_second.transferTo(savebottomFirstFileName);
            mainDTO.setMain_thumbnail_bottom_second(fullFileName);
        }
        if(!bottom_third.isEmpty()){
            String bottom_third_fileName = bottom_third.getOriginalFilename();
            String fullFileName = uuid+"_"+bottom_third_fileName;
            File savebottomFirstFileName = new File(fullFileName);
            bottom_third.transferTo(savebottomFirstFileName);
            mainDTO.setMain_thumbnail_bottom_third(fullFileName);
        }
        if(!bottom_fourth.isEmpty()){
            String bottom_fourth_fileName = bottom_fourth.getOriginalFilename();
            String fullFileName = uuid+"_"+bottom_fourth_fileName;
            File savebottomFirstFileName = new File(fullFileName);
            bottom_fourth.transferTo(savebottomFirstFileName);
            mainDTO.setMain_thumbnail_bottom_fourth(fullFileName);
        }

        mainService.write(mainDTO);
        return "redirect:/footballCheck/";
    }

//    @GetMapping("/{talkNum}")
//    public MainDTO get(@PathVariable int talkNum) {
//        return talkService.get(talkNum);
//    }

    @PutMapping("/{main_no}")
    public String mainUpdate(
            @PathVariable Integer main_no
            , MainDTO mainDTO
            , @RequestParam(value="top_first", required = false) MultipartFile top_first
            , @RequestParam(value="top_second", required = false) MultipartFile top_second
            , @RequestParam(value="top_third", required = false) MultipartFile top_third
            , @RequestParam(value="top_fourth", required = false) MultipartFile top_fourth
            , @RequestParam(value="bottom_first", required = false) MultipartFile bottom_first
            , @RequestParam(value="bottom_second", required = false) MultipartFile bottom_second
            , @RequestParam(value="bottom_third", required = false) MultipartFile bottom_third
            , @RequestParam(value="bottom_fourth", required = false) MultipartFile bottom_fourth) throws IOException {

        String uuid = UUID.randomUUID().toString();
        if(!top_first.isEmpty()){
            String top_first_fileName = top_first.getOriginalFilename();
            String fullFileName = uuid+"_"+top_first_fileName;
            File saveTopFirstFileName = new File(fullFileName);
            top_first.transferTo(saveTopFirstFileName);
            mainDTO.setMain_thumbnail_top_first(fullFileName);
        }
        if(!top_second.isEmpty()){
            String top_second_fileName = top_second.getOriginalFilename();
            String fullFileName = uuid+"_"+top_second_fileName;
            File saveTopFirstFileName = new File(fullFileName);
            top_second.transferTo(saveTopFirstFileName);
            mainDTO.setMain_thumbnail_top_second(fullFileName);
        }
        if(!top_third.isEmpty()){
            String top_third_fileName = top_third.getOriginalFilename();
            String fullFileName = uuid+"_"+top_third_fileName;
            File saveTopFirstFileName = new File(fullFileName);
            top_third.transferTo(saveTopFirstFileName);
            mainDTO.setMain_thumbnail_top_third(fullFileName);
        }
        if(!top_fourth.isEmpty()){
            String top_fourth_fileName = top_fourth.getOriginalFilename();
            String fullFileName = uuid+"_"+top_fourth_fileName;
            File saveTopFirstFileName = new File(fullFileName);
            top_fourth.transferTo(saveTopFirstFileName);
            mainDTO.setMain_thumbnail_top_fourth(fullFileName);
        }
        if(!bottom_first.isEmpty()){
            String bottom_first_fileName = bottom_first.getOriginalFilename();
            String fullFileName = uuid+"_"+bottom_first_fileName;
            File savebottomFirstFileName = new File(fullFileName);
            bottom_first.transferTo(savebottomFirstFileName);
            mainDTO.setMain_thumbnail_bottom_first(fullFileName);
        }
        if(!bottom_second.isEmpty()){
            String bottom_second_fileName = bottom_second.getOriginalFilename();
            String fullFileName = uuid+"_"+bottom_second_fileName;
            File savebottomFirstFileName = new File(fullFileName);
            bottom_second.transferTo(savebottomFirstFileName);
            mainDTO.setMain_thumbnail_bottom_second(fullFileName);
        }
        if(!bottom_third.isEmpty()){
            String bottom_third_fileName = bottom_third.getOriginalFilename();
            String fullFileName = uuid+"_"+bottom_third_fileName;
            File savebottomFirstFileName = new File(fullFileName);
            bottom_third.transferTo(savebottomFirstFileName);
            mainDTO.setMain_thumbnail_bottom_third(fullFileName);
        }
        if(!bottom_fourth.isEmpty()){
            String bottom_fourth_fileName = bottom_fourth.getOriginalFilename();
            String fullFileName = uuid+"_"+bottom_fourth_fileName;
            File savebottomFirstFileName = new File(fullFileName);
            bottom_fourth.transferTo(savebottomFirstFileName);
            mainDTO.setMain_thumbnail_bottom_fourth(fullFileName);
        }

        mainDTO.setMain_no(main_no);
        mainService.update(mainDTO);
        return "redirect:/footballCheck/";
    }

    @DeleteMapping("/{main_no}")
    public String mainDelete(@PathVariable Integer main_no) {
        mainService.delete(main_no);
        return "redirect:/footballCheck/";
    }

    @GetMapping("/getPrev/{main_no}")//이전글 로직
    public String getPrev(@PathVariable Integer main_no) {
        if(mainService.getPrev(main_no) != 0) {
            return "redirect:/footballCheck/contents?main_no="+mainService.getPrev(main_no);
        }else{
            return null;
        }
    }

    @GetMapping("/getNext/{main_no}")//이전글 로직
    public String getNext(@PathVariable Integer main_no) {
        if(mainService.getNext(main_no) != 0) {
            return "redirect:/footballCheck/contents?main_no="+mainService.getNext(main_no);
        }else{
            return null;
        }
    }

}
