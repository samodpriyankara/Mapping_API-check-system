package com.example.api_check.controller;


import com.example.api_check.DTO.UserDTO;
import com.example.api_check.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v3/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    public List<UserDTO> getUser(){

        return userService.getAllUsers();
    }

    @PostMapping("/saveuser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
       return userService.saveUser(userDTO);

    }

    @PutMapping("/updateuser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){

        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteuser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }
}
