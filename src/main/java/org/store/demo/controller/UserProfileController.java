package org.store.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.store.demo.model.User;
import org.store.demo.model.UserProfile;
import org.store.demo.repository.UserProfileRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/usersprofile")
@Api(value = "User Profile RESTful APIs")
public class UserProfileController {

    private UserProfileRepository userProfileRepository;

    @Autowired
    public void UserProfileRepository(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @ApiOperation(value = "Create a User Profile")
    @PostMapping
    //@ResponseStatus(CREATED)
    public UserProfile createUserProfile(@Valid @RequestBody UserProfile userProfile) {
        UserProfile createdUserProfile = userProfileRepository.save(userProfile);
        return createdUserProfile;
    }
}
