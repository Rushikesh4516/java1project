package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Account;
import com.model.Customer;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("cust_Account");
		EntityManager em=emf.createEntityManager();
		
		Account account=new Account(2121,"Saving account");
		
		Account account1=new Account();
		account1.setAccountNumber(2122);
		account1.setAccountType("current");
		
		Customer customer=new Customer();
		customer.setName("Ajay");
		customer.setAmount(50000);
		customer.setAccount(account);
		
		em.getTransaction().begin();
		em.persist(account);
		em.persist(customer);
		em.getTransaction().commit();
		System.out.println("Entites persist");
		
	}
	

}
