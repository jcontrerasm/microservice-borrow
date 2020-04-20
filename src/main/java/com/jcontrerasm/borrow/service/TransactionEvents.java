package com.jcontrerasm.borrow.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcontrerasm.borrow.model.entity.Borrow;
import com.jcontrerasm.borrow.model.entity.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TransactionEvents {
	
	private Logger log = LoggerFactory.getLogger(TransactionEvents.class);
	@Autowired
	private IBorrowService borrowRepository;
	@Autowired
	ObjectMapper objectMapper;
	
	public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		double newFeedAmount = 0;
		Borrow objBorrow = new Borrow();
		Transaction transactionEvent = objectMapper.readValue(consumerRecord.value(), Transaction.class);
		objBorrow = borrowRepository.findById(transactionEvent.getBorrowId());
		newFeedAmount = objBorrow.getFeeAmount() - transactionEvent.getFeeAmount();
		objBorrow.setFeeAmount(newFeedAmount);
		
		if (newFeedAmount <= 0) objBorrow.setPaid(true);
		
		borrowRepository.save(objBorrow);
	}
}
