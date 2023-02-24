package com.controller;

import com.service.impl.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

    @Controller
    public class DictionaryController {

        @Autowired
        private DictionaryService dictionaryService;


        @GetMapping
        public String toHome() {
            return "/index";
        }


        @PostMapping("/lookUp")
        public ModelAndView toDictionary(@RequestParam String word) {
            return new ModelAndView("/index", "result", dictionaryService.lookUp(word));
        }
    }
