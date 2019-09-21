package com.tiger.zmz.demo.dao;

import com.tiger.zmz.demo.model.Account;

import java.util.List;

/**
 * @author zhanghai2
 * @description dao
 * @date 2019-9-21
 */
public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
