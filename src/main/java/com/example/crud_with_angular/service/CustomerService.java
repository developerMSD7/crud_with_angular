package com.example.crud_with_angular.service;

import com.example.crud_with_angular.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {

    Flux<Customer> getAllCustomerList();

    Mono<Customer> findCustomerByCustomerId(String id);

    Mono<Customer> addNewCustomer(Customer customer);

    Mono<Void> deleteCustomerById(String id);

}
