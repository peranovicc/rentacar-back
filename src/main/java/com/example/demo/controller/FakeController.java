package com.example.demo.controller;

import com.example.demo.model.FoodModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class FakeController {
    @GetMapping("/fake")
    public String getFoodById() {
        return "FAKE CALL";
    }
}
