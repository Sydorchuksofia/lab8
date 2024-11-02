package com.example.lab8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab8.model.AppUser;
import com.example.lab8.repositoty.AppUserRepository;

@Service
public class AppUserService {
    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public AppUser createUser(AppUser fl) {
        return appUserRepository.save(fl);
    }

    public AppUser getUserByEmail(String email) {
        return appUserRepository.findUserByEmail(email);
    }
}
