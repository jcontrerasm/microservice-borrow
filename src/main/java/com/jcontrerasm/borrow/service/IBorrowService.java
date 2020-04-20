package com.jcontrerasm.borrow.service;

import java.util.List;

import com.jcontrerasm.borrow.model.entity.Borrow;

public interface IBorrowService {
	
	public List<Borrow> findAll();
	public Borrow findById(Integer id);
	public Borrow save(Borrow borrow);
}
