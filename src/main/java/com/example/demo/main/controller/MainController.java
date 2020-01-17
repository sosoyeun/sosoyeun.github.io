package com.example.demo.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String index(){
        return "/view/index";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String main(){
        return "/view/test";
    }
}
