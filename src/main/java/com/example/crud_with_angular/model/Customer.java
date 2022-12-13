package com.example.crud_with_angular.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@Document(collection = "Customer")
public class Customer {

    @MongoId
    private String id;
    private String name;
    private String phone;
    private String email;
    private List<Address> address;
}