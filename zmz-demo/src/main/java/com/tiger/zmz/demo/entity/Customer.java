package com.tiger.zmz.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author zhanghai2
 * @date 2019-9-23
 */
@Data
public class Customer {
    @Id
    public String id;

    public String firstName;

    public String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
