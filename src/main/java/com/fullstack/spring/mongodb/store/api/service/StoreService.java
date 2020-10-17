package com.fullstack.spring.mongodb.store.api.service;

import com.fullstack.spring.mongodb.store.api.model.User;
import com.fullstack.spring.mongodb.store.api.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public String placeOrder(User user) {
        storeRepository.save(user);
        return "Order placed successfully";
    }

    public List<User> getOrdersStore() {
        return storeRepository.findAll();
    }

    public List<User> getUserByName(String name) {
        List<User> users = storeRepository.findByName(name);
        return users;
    }

    public List<User> getUserByCity(String city) {
        List<User> users = storeRepository.findByCity(city);
        return users;
    }
}
