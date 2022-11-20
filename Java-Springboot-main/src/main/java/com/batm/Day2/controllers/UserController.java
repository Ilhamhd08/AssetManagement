package com.batm.Day2.controllers;


import com.batm.Day2.DTO.User.RegisterDTO;
import com.batm.Day2.entities.User;
import com.batm.Day2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String login(Model model){
        return "user/login";
    }

    @PostMapping("login")
    public void authLogin(Model model){
        System.out.println("Testing auth");
    }

    @GetMapping("register")
    public String register(Model model){
        model.addAttribute("user", new RegisterDTO());
        return "user/register";
    }

    @PostMapping("register")
    public void register(User user){
        System.out.println("From register");
        System.out.println();

//        return userService.saveUser(user);
    }
}
