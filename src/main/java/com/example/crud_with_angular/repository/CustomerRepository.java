package com.example.crud_with_angular.repository;

import com.example.crud_with_angular.model.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
    Mono<Customer> findByIdOrName(String id, String name);
}
