package com.delivery_express_be.Delivery_Express.controller;


import com.delivery_express_be.Delivery_Express.model.User;
import com.delivery_express_be.Delivery_Express.model.UserLoginRequest;
import com.delivery_express_be.Delivery_Express.model.UserRegisterRequest;
import com.delivery_express_be.Delivery_Express.model.UserResponse;
import com.delivery_express_be.Delivery_Express.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RequestMapping("/user")
@RestController
public class UserAuthController {
    @Autowired
    UserAuthService userAuthService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegisterRequest request){
        User user = userAuthService.registerUser(request);
        if(user==null){
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(Map.of("error", "Email already in use."));
        }
        else {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new UserResponse(user.getUserid(), user.getFirstname(),user.getLastname(),user.getEmail(),user.getUsertype()));
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody UserLoginRequest request){
        User user = userAuthService.loginUser(request);
        if(user!=null){
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(new UserResponse(user.getUserid(), user.getFirstname(),user.getLastname(),user.getEmail(),user.getUsertype()));
        }
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Map.of("error", "Account does not exist."));
    }
}
