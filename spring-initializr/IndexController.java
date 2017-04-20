package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

public class IndexController {
    String index(Model model){
        return "index";
    }
}
