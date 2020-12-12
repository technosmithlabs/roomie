package com.technosmithlabs.roomie.userinventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void registerUser() {
        System.out.println("I am trying to register the user!");
    }

}
