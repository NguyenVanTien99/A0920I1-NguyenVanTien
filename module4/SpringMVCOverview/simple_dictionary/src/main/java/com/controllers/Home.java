package com.controllers;

import com.service.iDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

    @Autowired
    iDictionaryService iDictionaryService;

    @GetMapping("/translate")
    public ModelAndView Home() {
        return new ModelAndView("home");
    }

    @PostMapping("/translate")
    public ModelAndView getCurrency(@RequestParam(value="eng", required=true) String eng) {
        return new ModelAndView("home", "vn", iDictionaryService.toVn(eng));
    }
}
