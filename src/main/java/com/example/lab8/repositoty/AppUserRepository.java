package com.example.lab8.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.lab8.model.AppUser;
@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    @Query("SELECT u FROM app_user u WHERE u.email = ?1")
    AppUser findUserByEmail(String email);
}
