package spting.git.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping({"/","/home"})
    public String welcome(){
        return "welcome";
    }

}
