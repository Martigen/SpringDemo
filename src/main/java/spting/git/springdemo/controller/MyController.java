package spting.git.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping({"/","/home"})
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/you")
    public String you(Model model){
        model.addAttribute("on","to on");
        model.addAttribute("jego","to jego");
        return "you";
    }

}
