package com.dhc.hys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/user")
public class UserController {


//    @RequestMapping("/umv")
//    public String userview(){
//        System.out.print("ssssss");
//        return "redirect:login.html";
//    }
@RequestMapping("/umv")
public String userview(){
    System.out.print("ssssss");
    return "/login";
}

    @ResponseBody
    @RequestMapping("/hello")
    public String test(){
        return "hello";

}
}
