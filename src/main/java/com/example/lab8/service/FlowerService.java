package com.example.lab8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab8.model.Flower;
import com.example.lab8.repositoty.FlowerRepository;
@Service
public class FlowerService {
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public Flower createFlower(Flower fl) {
        return flowerRepository.save(fl);
    }
}
