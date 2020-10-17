package com.fullstack.spring.mongodb.store.api.repository;

import com.fullstack.spring.mongodb.store.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface StoreRepository extends MongoRepository<User, Integer> {
    List<User> findByName(String name);
    @Query("{'Address.city':?0}")
    List<User> findByCity(String city);
}
