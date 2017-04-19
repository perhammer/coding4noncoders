package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {
    @RequestMapping("/")
    String index(Model model){
        model.addAttribute("hello", "dolly");
        return "index";
    }
}