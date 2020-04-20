package com.jcontrerasm.borrow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jcontrerasm.borrow.model.entity.Borrow;
import com.jcontrerasm.borrow.service.IBorrowService;

@RestController
public class BorrowController {

	@Autowired
	private IBorrowService borrowService;

	@GetMapping("/v1/borrow")
	public List<Borrow> list() {
		return (List<Borrow>) borrowService.findAll();
	}
	
	@GetMapping("/v1/borrow/{id}")
	public Borrow detail(@PathVariable Integer id) {
		return borrowService.findById(id);
	}
}
