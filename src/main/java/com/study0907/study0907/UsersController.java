package com.study0907.study0907;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;
    

    @PostMapping
    public ResponseEntity<String> createUsers(@RequestBody UsersDTO usersDTO){
        usersService.createUsers(usersDTO);
        return ResponseEntity.ok().body("success");
    }
}
