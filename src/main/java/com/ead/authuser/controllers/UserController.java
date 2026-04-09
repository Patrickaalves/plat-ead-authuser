package com.ead.authuser.controllers;

import com.ead.authuser.services.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }



}
