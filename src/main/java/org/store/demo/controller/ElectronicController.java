package org.store.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.store.demo.model.Electronic;
import org.store.demo.model.User;
import org.store.demo.repository.ElectronicRepository;
import org.store.demo.repository.UserRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/electronic")
@Api(value = "Electronic RESTful APIs")
public class ElectronicController {

    private ElectronicRepository electronicRepository;

    @Autowired
    public void ElectronicRepository(ElectronicRepository electronicRepository) {
        this.electronicRepository = electronicRepository;
    }

    @ApiOperation(value = "Create a Electronic")
    @PostMapping
    //@ResponseStatus(CREATED)
    public Electronic createElectronic(@Valid @RequestBody Electronic electronic) {
        Electronic createdElectronic = electronicRepository.save(electronic);
        return createdElectronic;
    }
}
