package com.sebastien.ecocompo.controller;

import com.sebastien.ecocompo.entity.User;
import com.sebastien.ecocompo.entity.dto.UserDto;
import com.sebastien.ecocompo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping()
    public User getUser(Long userId) throws Exception {
        return userService.findUserById(userId);
    }

}
