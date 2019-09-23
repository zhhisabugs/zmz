package com.tiger.zmz.demo.dao;

import com.tiger.zmz.demo.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author zhanghai2
 * @date 2019-9-23
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {
    public List<Customer> findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);
}
