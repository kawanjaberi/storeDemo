package org.store.demo.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.store.demo.model.Foods;
import org.store.demo.model.User;
import org.store.demo.repository.FoodRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/food")
@Api(value = "Food RESTful APIs")
public class FoodController {

    private FoodRepository foodRepository;

    @Autowired
    public void FoodRepository(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @ApiOperation(value = "Create a Food")
    @PostMapping
    public Foods creatFood(@Valid @RequestBody Foods food) {
        Foods createdFood = foodRepository.save(food);
        return createdFood;
    }
}
