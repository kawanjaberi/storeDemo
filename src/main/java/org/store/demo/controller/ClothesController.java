package org.store.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.store.demo.model.Clothes;
import org.store.demo.model.User;
import org.store.demo.repository.ClothesRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/clothes")
@Api(value = "Clothes RESTful APIs")
public class ClothesController {

    private ClothesRepository clothesRepository;

    @Autowired
    public void ClothesRepository(ClothesRepository clothesRepository) {
        this.clothesRepository = clothesRepository;
    }

    @ApiOperation(value = "Create a Clothe")
    @PostMapping
    public Clothes createClothe(@Valid @RequestBody Clothes clothe) {
        Clothes createdClothes = clothesRepository.save(clothe);
        return createdClothes;
    }

}
