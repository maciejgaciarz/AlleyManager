package com.bowlingcenter.alleymanager;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("indexController")
public class IndexController {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String Index(){
    return "/index.html";
        //redirect to index.html from localhost:8080/
    }
}