package com.footballCheck.controller;


import com.footballCheck.domain.main.MainDTO;
import com.footballCheck.pagination.Criteria;
import com.footballCheck.pagination.PageMaker;
import com.footballCheck.service.main.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class controller {

    private final MainService mainService;

    @GetMapping
    public String index(Criteria criteria, Model model) {

        PageMaker pageMaker = new PageMaker();
        pageMaker.setCri(criteria);
        pageMaker.setTotalCount(mainService.countList());

        List<MainDTO> List = mainService.getList(criteria);

        model.addAttribute("list", List);
        model.addAttribute("pageMaker", pageMaker);

        return "index";
    }

    @GetMapping("/contents")
    public String contents(@RequestParam(required = false) Integer main_no, Model model) {

        if (main_no == null) {
            return "index";
        } else {
            mainService.updateViewCnt(main_no);
            MainDTO mainDTO = mainService.getContent(main_no);
            model.addAttribute("main", mainDTO);
            model.addAttribute("first", mainService.getFirst());
            model.addAttribute("last", mainService.getLast());
            return "views/content";
        }

    }

    @GetMapping("/write")
    public String write() {

        return "views/write";
    }

    @GetMapping("/update")
    public String update(@RequestParam(required = false) Integer main_no, Model model) {

        if (main_no == null) {
            return "index";
        } else {
            MainDTO mainDTO = mainService.getContent(main_no);
            model.addAttribute("main", mainDTO);
            return "views/update";
        }
    }

}
