package com.example.transaction;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.transaction.controller.TransactionController;
import com.example.transaction.entities.Transaction;
import com.example.transaction.repositories.TransactionRepository;

@SpringBootTest
class TransactionProjectsApplicationTests {

	@Mock
	TransactionRepository transactionRepository;
	@InjectMocks
	TransactionController transactionController;
	@Test
	void testSaveTransaction() {
		Transaction transaction=new Transaction();
		Transaction savedTransaction=new Transaction();
		savedTransaction.setAmount(12000.0);
		when(transactionRepository.save(transaction)).thenReturn(savedTransaction);
		Transaction outputTransaction=transactionController.saveTransaction(transaction);
		assertNotNull(outputTransaction);
		assertNotNull(outputTransaction.getAmount());
		verify(transactionRepository).save(transaction);
		
	}
	@Test
	void testGetAllTransactions() {
		
		ArrayList<Transaction> transactions=new ArrayList<Transaction>();
		transactions.add(new Transaction());
		when(transactionRepository.findAll()).thenReturn(transactions);
		List<Transaction>transactionList=transactionController.getAllTransactions();
		assertNotNull(transactionList);
	}

}
