package com.footballCheck.controller.api;

import com.footballCheck.domain.main.MainDTO;
import com.footballCheck.service.main.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/main")
@RequiredArgsConstructor
public class ApiMainController {

    private final MainService mainService;

    @PostMapping
    public String write(MainDTO mainDTO) {
        mainService.write(mainDTO);
        return "redirect:/";
    }

//    @GetMapping("/{talkNum}")
//    public MainDTO get(@PathVariable int talkNum) {
//        return talkService.get(talkNum);
//    }

    @PutMapping("/{main_no}")
    public String mainUpdate(@PathVariable Integer main_no, MainDTO mainDTO){
        mainDTO.setMain_no(main_no);
        mainService.update(mainDTO);
        return "redirect:/";
    }

    @DeleteMapping("/{main_no}")
    public String mainDelete(@PathVariable Integer main_no) {
        mainService.delete(main_no);
        return "redirect:/";
    }

    @GetMapping("/getPrev/{main_no}")//이전글 로직
    public String getPrev(@PathVariable Integer main_no) {
        if(mainService.getPrev(main_no) != 0) {
            return "redirect:/contents?main_no="+mainService.getPrev(main_no);
        }else{
            return null;
        }
    }

    @GetMapping("/getNext/{main_no}")//이전글 로직
    public String getNext(@PathVariable Integer main_no) {
        if(mainService.getNext(main_no) != 0) {
            return "redirect:/contents?main_no="+mainService.getNext(main_no);
        }else{
            return null;
        }
    }

}
