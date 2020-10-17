package com.fullstack.spring.mongodb.store.api.controller;

import com.fullstack.spring.mongodb.store.api.model.User;
import com.fullstack.spring.mongodb.store.api.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody User user) {
        return storeService.placeOrder(user);
    }

    @GetMapping("/getOrdersStore")
    public List<User> getOrdersStore() {
        return storeService.getOrdersStore();
    }

    @GetMapping("/getUserByName/{name}")
    public List<User> getUserByName(@PathVariable String name) {
        return storeService.getUserByName(name);
    }

    @GetMapping("/getUserByCity/{city}")
    public List<User> getUserByCity(@PathVariable String city) {
        return storeService.getUserByCity(city);
    }
}
