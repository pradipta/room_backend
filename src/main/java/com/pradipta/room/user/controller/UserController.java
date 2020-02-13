package com.pradipta.room.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;

@RequestMapping("/user")
@RestController
public class UserController {
    @GetMapping("/signup")
    public String signup(){
        return "hi";
    }
}
