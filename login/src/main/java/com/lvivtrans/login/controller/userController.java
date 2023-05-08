package com.lvivtrans.login.controller;

import com.lvivtrans.login.model.user;
import com.lvivtrans.login.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class userController {
    @Autowired
    private userService userService;

    @PostMapping("/add")
    public String add(@RequestBody user user){
        userService.saveUser(user);
        return "New user is added";
    }

    @GetMapping("/getAll")
    public List<user> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{email}")
    user getUserByEmail(@PathVariable String email){
        return userService.findByEmail(email);
    }
}
