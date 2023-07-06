package com.github.franklinthree.controller.public1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
