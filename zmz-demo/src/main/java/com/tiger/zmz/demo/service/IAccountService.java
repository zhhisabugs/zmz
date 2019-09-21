package com.tiger.zmz.demo.service;

import com.tiger.zmz.demo.model.Account;

import java.util.List;

/**
 * @author zhanghai2
 * @date 2019-9-21
 */
public interface IAccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
