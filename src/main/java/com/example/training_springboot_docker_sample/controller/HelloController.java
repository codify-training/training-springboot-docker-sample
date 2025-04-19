package com.example.training_springboot_docker_sample.controller;


import com.example.training_springboot_docker_sample.entity.User;
import com.example.training_springboot_docker_sample.respository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class HelloController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }

}
