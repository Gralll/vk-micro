package com.gralll.repost.controller;

import com.gralll.repost.client.WallClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepostController {

    @Autowired
    private WallClient wallClient;

    @GetMapping("/hello")
    public String getSomething() {
        return "Hello " + wallClient.getSomething();
    }

    @GetMapping("/hello1")
    public String getSomething1() {
        return "Hello1";
    }

    @GetMapping
    public String repost() {

    }
}
