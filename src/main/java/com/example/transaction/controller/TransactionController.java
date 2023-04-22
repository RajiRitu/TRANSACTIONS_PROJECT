package com.example.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.transaction.entities.Transaction;
import com.example.transaction.repositories.TransactionRepository;
/**
 * @author  raji
 *
 */ 
@RestController
public class TransactionController {
	
	@Autowired
	TransactionRepository transactionRepository;
	
	@PostMapping("/saveTransaction")
	public Transaction saveTransaction(@RequestBody Transaction transaction) {
		
		return transactionRepository.save(transaction);
		
	}
	
	@GetMapping("/getTransactions")
	public List<Transaction> getAllTransactions(){
		return transactionRepository.findAll();
	}
	

}
