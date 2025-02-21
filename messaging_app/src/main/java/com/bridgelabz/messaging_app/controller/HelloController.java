package com.bridgelabz.messaging_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET Request
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // POST Request
    @PostMapping
    public String sayHelloPost(@RequestBody String name) {
        return "Hello, " + name + " from BridgeLabz";
    }

    // PUT Request
    @PutMapping
    public String sayHelloPut(@RequestBody String name) {
        return "Hello, " + name + "! Your data has been updated.";
    }

    // DELETE Request
    @DeleteMapping("/{name}")
    public String sayHelloDelete(@PathVariable String name) {
        return "Goodbye, " + name + "! Your data has been deleted.";
    }
}

