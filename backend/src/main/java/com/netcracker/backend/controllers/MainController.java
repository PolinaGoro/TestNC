package com.netcracker.backend.controllers;

import com.netcracker.backend.entity.User;
import com.netcracker.backend.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @RequestMapping("/users")
    public List<User> getUser(
            @RequestParam (value = "name", defaultValue = "World") String name
    ){
        UserRepository userRepository = new UserRepository();
        List<User> all = userRepository.getAll();
        User user = new User();
        user.setNickname(name);
        all.add(user);
        return all;
    }
}
