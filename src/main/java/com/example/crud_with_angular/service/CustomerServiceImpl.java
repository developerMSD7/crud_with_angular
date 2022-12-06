package com.example.crud_with_angular.service;

import com.example.crud_with_angular.model.Customer;
import com.example.crud_with_angular.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Flux<Customer> getAllCustomerList() {
        return this.customerRepository.findAll();
    }

    @Override
    public Mono<Customer> findCustomerByCustomerId(String id) {
        return this.customerRepository.findById(id);
    }

    @Override
    public Mono<Customer> addNewCustomer(Customer customer) {
        return this.customerRepository.save(customer);
    }

    @Override
    public Mono<Void> deleteCustomerById(String id) {
        return this.customerRepository.deleteById(id);
    }
}
