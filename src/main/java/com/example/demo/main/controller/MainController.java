package com.example.demo.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(){
        return "/view/layout/index";
    }

    @RequestMapping(value = "header", method = RequestMethod.GET)
    public String header(){
        return "/view/fragments/header";
    }

    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String main(){
        return "/view/main";
    }

    @RequestMapping(value = "footer", method = RequestMethod.GET)
    public String footer(){
        return "/view/fragments/footer";
    }
}
