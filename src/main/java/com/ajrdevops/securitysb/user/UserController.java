package com.ajrdevops.securitysb.user;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

}
