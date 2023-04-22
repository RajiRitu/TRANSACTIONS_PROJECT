/**
 * 
 */
package com.example.transaction.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.transaction.entities.Transaction;

/**
 * @author  raji
 *
 */
public interface TransactionRepository extends JpaRepository<Transaction,Integer>  {

}
