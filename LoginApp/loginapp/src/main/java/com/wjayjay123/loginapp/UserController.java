package com.wjayjay123.loginapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}/{password}")
    public ResponseEntity<User> getUser(@PathVariable String username, @PathVariable String password) {
        return new ResponseEntity<User>(userService.getUserByUsernameAndPassword(username, password), HttpStatus.OK);
    }

}
