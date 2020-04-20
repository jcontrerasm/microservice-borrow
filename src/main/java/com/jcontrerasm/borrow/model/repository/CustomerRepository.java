package com.jcontrerasm.borrow.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jcontrerasm.borrow.model.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {}
