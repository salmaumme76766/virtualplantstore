package com.example.virtualplantstore.Controller;

import com.example.virtualplantstore.Entity.User;
import com.example.virtualplantstore.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    public UserRepo userRepo;

    @PostMapping("/addUser")
    public ResponseEntity<?> addUser(@RequestBody User obj){
        userRepo.save(obj);
        return new ResponseEntity<>("user added", HttpStatus.OK);
    }
}
