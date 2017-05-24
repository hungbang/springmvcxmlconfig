package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by KAI on 5/24/17.
 */

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/home")
    public String home(){
        return "hello world";
    }
}
