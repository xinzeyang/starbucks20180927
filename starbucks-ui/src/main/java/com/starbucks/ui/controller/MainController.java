package com.starbucks.ui.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MainController {

    @RequestMapping(value = {"","main"}, method = RequestMethod.GET)
    public String main() {

        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {

        return "login";
    }


    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

}
