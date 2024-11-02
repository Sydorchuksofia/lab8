package com.example.lab8.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab8.model.AppUser;
import com.example.lab8.service.AppUserService;

@RestController
@RequestMapping("/api/v1")
public class AppUserController {
    private AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService userService) {
        this.appUserService = userService;
    }

    @GetMapping("/user")
    public List<AppUser> getUsers() {
        return appUserService.getUsers();
    }

    @PostMapping("/user")
    public AppUser creatUser(@RequestBody AppUser user) {
        return appUserService.createUser(user);
    }

    @GetMapping("/user/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email) {
        AppUser userByEmail = appUserService.getUserByEmail(email);
        if (userByEmail != null) {
            return ResponseEntity.ok(userByEmail);
        }
        return ResponseEntity.notFound().build();
    }
}
