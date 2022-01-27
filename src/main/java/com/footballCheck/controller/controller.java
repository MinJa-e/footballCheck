package com.footballCheck.controller;


import com.footballCheck.domain.main.MainDTO;
import com.footballCheck.mapper.main.MainMapper;
import com.footballCheck.pagination.Criteria;
import com.footballCheck.pagination.PageMaker;
import com.footballCheck.service.main.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import javax.servlet.ServletContext;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class controller {

    private final MainService mainService;

    @GetMapping
    public String index(Criteria criteria, Model model) {

        PageMaker pageMaker = new PageMaker();
        pageMaker.setCri(criteria);
        pageMaker.setTotalCount(mainService.countList());// 총게시글수 조횐데 아직 로직 구현x여서 임의로 넣음

        List<MainDTO> List = mainService.getList(criteria);

        model.addAttribute("list", mainService.getList(criteria));
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
