package org.store.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.store.demo.model.User;
import org.store.demo.repository.UserRepository;

import javax.validation.Valid;
import java.security.PublicKey;

@RestController
@RequestMapping("/api/users")
@Api(value = "User RESTful APIs")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public void UserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ApiOperation(value = "Create a User")
    @PostMapping
    //@ResponseStatus(CREATED)
    public User createUser(@Valid @RequestBody User user) {
        User createdUser = userRepository.save(user);
        return createdUser;
    }

}
