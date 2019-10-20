package com.czz.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-10-20 16:38
 */
@Controller
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
