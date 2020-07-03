package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findAll(Sort sort);
	List<Customer> findByLastName(String lastName);
	List<Customer> findByLastNameContaining(String lastName);
	List<Customer> findByLastNameContainingOrderByIdDesc(String lastName);
	List<Customer> findByLastNameOrFirstNameContainingOrderByIdDesc(String name,String name2);

	Customer findById(long id);
}
