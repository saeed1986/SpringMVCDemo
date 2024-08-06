package com.example.springMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName() {
        return "JAVA";
    }
    @RequestMapping("/")
    public String home() {
        System.out.println("Home Controller Method called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(int num1, int num2, ModelAndView mv) {
        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addAlien") // This is my path or url
    public String addAlien(@ModelAttribute("alien1") Alien alien) { // // @ModelAttribute is optional and we use it if we want to change some names. Here, for example, we use "alien1" but it means "alien".
        return "result";
    }
}
