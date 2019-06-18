package com.itmuch.controller;

import com.itmuch.dao.UserRepository;
import com.itmuch.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/06/16 23:02
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return this.userRepository.findById(id);
    }

}
