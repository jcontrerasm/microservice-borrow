package com.jcontrerasm.borrow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jcontrerasm.borrow.model.entity.Borrow;
import com.jcontrerasm.borrow.model.repository.BorrowRepository;

@Service
public class BorrowServiceImpl implements IBorrowService {
	
	@Autowired
	private BorrowRepository borrowRepository;
	
	@Override
	public List<Borrow> findAll() {
		return (List<Borrow>) borrowRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Borrow findById(Integer id) {
		return borrowRepository.findById(id).orElse(null);
	}

	@Override
	public Borrow save(Borrow borrow) {
		return borrowRepository.save(borrow);
	}
}
