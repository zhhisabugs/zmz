package com.tiger.zmz.demo.dao.impl;

import com.tiger.zmz.demo.dao.IAccountDAO;
import com.tiger.zmz.demo.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhanghai2
 * @date 2019-9-21
 */
@Repository
public class AccountDAOImpl implements IAccountDAO {

    @Autowired
    private JdbcTemplate template;

    @Override
    public int add(Account account) {
        return template.update("insert into account(name, money) values(?, ?)", account.getName(), account.getMoney());
    }

    @Override
    public int update(Account account) {
        return template.update("update account set name = ?, money = ? where id = ?", account.getName(),
                account.getMoney(), account.getId());
    }

    @Override
    public int delete(int id) {
        return template.update("delete from account where id = ?", id);
    }

    @Override
    public Account findAccountById(int id) {
        List<Account> list = template.query("select * from account where id = ? limit 1", new Object[]{id}, new BeanPropertyRowMapper(Account.class));
        if (null != list || !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<Account> findAccountList() {
        List<Account> list = template.query("select * from account", new Object[]{}, new BeanPropertyRowMapper(Account.class));
        return list;
    }
}
