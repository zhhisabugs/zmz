package com.tiger.zmz.demo.service.impl;

import com.tiger.zmz.demo.dao.AccountMapper;
import com.tiger.zmz.demo.dao.IAccountDAO;
import com.tiger.zmz.demo.model.Account;
import com.tiger.zmz.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhanghai2
 * @date 2019-9-21
 */
@Service
public class AccountService implements IAccountService {

    @Autowired
    IAccountDAO accountDAO;

    @Autowired
    AccountMapper accountMapper;

    @Override
    public int add(Account account) {
        // return accountDAO.add(account);
        return accountMapper.add(account);
    }

    @Override
    public int update(Account account) {
        // return accountDAO.update(account);
        return accountMapper.update(account);
    }

    @Override
    public int delete(int id) {
        // return accountDAO.delete(id);
        return accountMapper.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        // return accountDAO.findAccountById(id);
        return accountMapper.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        // return accountDAO.findAccountList();
        return accountMapper.findAccoundList();
    }
}
