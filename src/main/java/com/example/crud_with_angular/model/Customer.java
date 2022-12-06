package com.example.crud_with_angular.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("Customer")
public class Customer {

    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    private List<Address> address;
}