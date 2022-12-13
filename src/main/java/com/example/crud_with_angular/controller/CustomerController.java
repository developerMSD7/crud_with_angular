package com.example.crud_with_angular.controller;

import com.example.crud_with_angular.model.Customer;
import com.example.crud_with_angular.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/getAllCustomers")
    public Flux<Customer> getAllCustomer() {
        return this.customerService.getAllCustomerList();

    }

    @GetMapping("/findById")
    public Mono<Customer> findCustomerByCustomerId(@RequestParam String id) {
        return this.customerService.findCustomerByCustomerId(id);
    }

    @PostMapping("/add")
    Mono<Customer> addNewCustomer(@RequestBody Customer customer) {
        return this.customerService.addNewCustomer(customer);
    }

    @DeleteMapping("/delete")
    Mono<Void> deleteCustomerById(@RequestParam String id) {
        return this.customerService.deleteCustomerById(id);
    }

    @GetMapping("/findByIdAndName")
    public ResponseEntity<Mono<Customer>> findByIdAndName(@RequestParam("Id") String id, @RequestParam("Name") String name) {
        return new ResponseEntity<>(this.customerService.findByIdAndName(id, name), HttpStatus.OK);

    }
}