package com.example.demo.controller;

import com.example.demo.dao.MealDaoSQL;
import com.example.demo.model.request.MealRequestModel;
import com.example.demo.model.response.MealResponseModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class MealController {
    private static final MealDaoSQL md = new MealDaoSQL();

    @GetMapping("/meals")
    public List<MealRequestModel> getAllMeals() {
        return md.getAllMeals();
    }

    @GetMapping("/meals/search")
    public List<MealRequestModel> searchMeals(@RequestParam(value = "name") String mealName) {
        return md.searchMeal(mealName.toLowerCase());
    }

    @PostMapping("/meals/search")
    public List<MealResponseModel> searchMealsAndFood() {
        return md.searchMealsAndFood();
    }
}
