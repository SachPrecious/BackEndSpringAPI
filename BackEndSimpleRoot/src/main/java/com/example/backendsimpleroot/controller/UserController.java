package com.example.backendsimpleroot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
public class UserController {

    //get -get data
    //post -save data
    //put - update data
    //delete -delete data
    //All of these are post requests we are going to implement here
    @GetMapping("/getUser")
    public String getUser(){
        return "Get User";
    }

    @PostMapping("/saveUser")
    public String saveUser(){
        return "Save User";
    }


    @PutMapping("/updateUser")
    public String updateUser(){
        return "Update User";
    }


    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "Delete User";
    }




}
