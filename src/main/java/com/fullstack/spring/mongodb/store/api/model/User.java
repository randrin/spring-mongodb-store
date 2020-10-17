package com.fullstack.spring.mongodb.store.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "ORDER_USER_DB")
public class User {
    @Id
    private int id;
    private String name;
    private String gender;
    private List<Product> products;
    private Address address;
}
