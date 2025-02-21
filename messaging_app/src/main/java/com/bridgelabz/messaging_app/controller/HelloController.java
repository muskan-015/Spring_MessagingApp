package com.bridgelabz.messaging_app.controller;

import com.bridgelabz.messaging_app.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // POST Request with Request Body
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}

