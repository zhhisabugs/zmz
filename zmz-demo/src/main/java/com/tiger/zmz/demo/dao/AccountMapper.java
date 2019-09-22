package com.tiger.zmz.demo.dao;

import com.tiger.zmz.demo.model.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhanghai2
 * @date 2019/9/22
 */
@Mapper
@Repository
public interface AccountMapper {
    @Insert("insert into account(name, money) values(#{name}, #{money})")
    int add(Account account);

    @Update("update account set name = #{name}, money = #{money} where id = #{id}")
    int update(Account account);

    @Delete("delete from account where id = #{id}")
    int delete(int id);

    @Select("select id, name, money from account where id = #{id} limit 1")
    Account findAccountById(@Param("id") int id);

    @Select("select id, name, money from account")
    List<Account> findAccoundList();
}
