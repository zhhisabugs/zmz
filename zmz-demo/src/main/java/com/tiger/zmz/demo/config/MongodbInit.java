package com.tiger.zmz.demo.config;

import com.tiger.zmz.demo.dao.CustomerRepository;
import com.tiger.zmz.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * @author zhanghai2
 * @date 2019-9-23
 */
public class MongodbInit implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("初始化进行");
        repository.deleteAll();
        repository.save(new Customer("zhang", "san"));
        repository.save(new Customer("li", "si"));
        System.out.println("List All Customer");
        for (Customer customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println("findByLastName---");
        for (Customer customer : repository.findByLastName("zhang")) {
            System.out.println(customer);
        }
    }
}
