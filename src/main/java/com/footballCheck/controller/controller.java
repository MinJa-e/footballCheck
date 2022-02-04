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

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class controller {

    private final MainService mainService;

    @GetMapping
    public String index(Criteria criteria
            , @RequestParam(value = "searchType", required = false) String searchType
            , @RequestParam(value = "searchKeyword", required = false) String searchKeyword
            , @RequestParam(value = "category", required = false) String category
            , Model model
            , HttpServletRequest request) {

        PageMaker pageMaker = new PageMaker();
        pageMaker.setCri(criteria);
        pageMaker.setTotalCount(mainService.countList());

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Criteria", criteria);
        map.put("searchType", searchType);
        map.put("searchKeyword", searchKeyword);
        map.put("category", category);
        List<MainDTO> list = mainService.getList(map);

        String baseUri = request.getQueryString();
        if(category != null){//해당문자열이없으면-1을리턴
            String uriCategory = baseUri.substring((baseUri.lastIndexOf("&category")));
            String deleteCategoryUri = baseUri.replace(uriCategory,"");
            model.addAttribute("deleteCategoryUri", deleteCategoryUri);
        }else {
            model.addAttribute("deleteCategoryUri", baseUri);
        }

        MainDTO thumbnail_1 = mainService.getRecent_Thumbnail_top_first();
        MainDTO thumbnail_2 = mainService.getRecent_Thumbnail_top_second();
        MainDTO thumbnail_3 = mainService.getRecent_Thumbnail_top_third();
        MainDTO thumbnail_4 = mainService.getRecent_Thumbnail_top_fourth();
        MainDTO thumbnail_5 = mainService.getRecent_Thumbnail_bottom_first();
        MainDTO thumbnail_6 = mainService.getRecent_Thumbnail_bottom_second();
        MainDTO thumbnail_7 = mainService.getRecent_Thumbnail_bottom_third();
        MainDTO thumbnail_8 = mainService.getRecent_Thumbnail_bottom_fourth();

        model.addAttribute("thumbnail_1", thumbnail_1);
        model.addAttribute("thumbnail_2", thumbnail_2);
        model.addAttribute("thumbnail_3", thumbnail_3);
        model.addAttribute("thumbnail_4", thumbnail_4);
        model.addAttribute("thumbnail_5", thumbnail_5);
        model.addAttribute("thumbnail_6", thumbnail_6);
        model.addAttribute("thumbnail_7", thumbnail_7);
        model.addAttribute("thumbnail_8", thumbnail_8);
        model.addAttribute("list", list);
        model.addAttribute("pageMaker", pageMaker);
        model.addAttribute("category", category);

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
