package com.gralll.wall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class WallController {

    @GetMapping("/post")
    public String getSomething() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Post 1";
    }

    @GetMapping("/post1")
    public String getSomething1() {
        return "Post 2";
    }
}
