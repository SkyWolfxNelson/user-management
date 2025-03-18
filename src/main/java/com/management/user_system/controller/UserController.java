package com.management.user_system.controller;

import com.management.user_system.entity.primary.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @PostMapping
    public ResponseEntity bandeja(@RequestBody User user) {
        return ResponseEntity.ok().body(user);
    }
}
