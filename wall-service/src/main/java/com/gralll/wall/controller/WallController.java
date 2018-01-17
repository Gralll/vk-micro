package com.gralll.wall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WallController {

    @GetMapping("/post")
    public String getSomething() {
        return "Post 1";
    }

    @GetMapping("/post1")
    public String getSomething1() {
        return "Post 2";
    }
}
