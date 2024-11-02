package com.example.lab8.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lab8.model.Flower;
@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
