/**
 * 
 */
package com.example.transaction.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Raji
 * Model Class
 *
 */
@Entity
@Table(name="transaction")
public class Transaction {

	@Id
	@Column(name="source_account_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sourceAccountId;
	private Double amount;
	public int getSourceAccountId() {
		return sourceAccountId;
	}
	public void setSourceAccountId(int sourceAccountId) {
		this.sourceAccountId = sourceAccountId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	private String currency;
	
	
	
}
