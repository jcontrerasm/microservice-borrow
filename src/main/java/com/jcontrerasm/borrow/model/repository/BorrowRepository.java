package com.jcontrerasm.borrow.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jcontrerasm.borrow.model.entity.Borrow;

@Repository
public interface BorrowRepository extends CrudRepository<Borrow, Integer> {}
