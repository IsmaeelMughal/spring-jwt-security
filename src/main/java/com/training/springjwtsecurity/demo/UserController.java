package com.training.springjwtsecurity.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/u")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String userRoute()
    {
        return "USER SECURED";
    }
}
