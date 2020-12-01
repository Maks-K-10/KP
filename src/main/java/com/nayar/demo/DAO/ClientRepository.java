package com.nayar.demo.DAO;

import com.nayar.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Customer, Long> {
}
