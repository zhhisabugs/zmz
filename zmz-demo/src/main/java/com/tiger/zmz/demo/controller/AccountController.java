package com.tiger.zmz.demo.controller;

import com.tiger.zmz.demo.model.Account;
import com.tiger.zmz.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhanghai2
 * @date 2019-9-21
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int add(@RequestBody Account account) {
        return accountService.add(account);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public int update(@RequestBody Account account) {
        return accountService.update(account);
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public int delete(@RequestParam(value = "id", required = true) int id) {
        return accountService.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account findAccountById(@PathVariable("id") int id) {
        return accountService.findAccountById(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> findAccountList() {
        return accountService.findAccountList();
    }
}
