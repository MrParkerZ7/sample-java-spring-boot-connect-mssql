package com.demo.mssql.javaspringbootconnectmssqlsample.controller;

import com.demo.mssql.javaspringbootconnectmssqlsample.model.User;
import com.demo.mssql.javaspringbootconnectmssqlsample.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    User getAllUser() {
        return userRepository.findByName("Puck");
    }
}
