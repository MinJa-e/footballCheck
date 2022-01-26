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
//
//    @PutMapping("/{talkNum}")
//    public void update(MainDTO MainDTO) {
//        talkService.update(MainDTO);
//    }
//
//    @GetMapping("/delete/{talkNum}")
//    public String delete(@PathVariable int talkNum) {
//        talkService.delete(talkNum);
//        return "redirect:/talk";
//    }

}
