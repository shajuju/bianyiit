package com.rw.controller;

import com.rw.pojo.User;
import com.rw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<User> list = userService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @RequestMapping("/saveUser")
    public String saveUser(User user){
        userService.saveUser(user);
        return "redirect:/user/findAll";
    }
}
