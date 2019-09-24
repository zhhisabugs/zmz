package com.tiger.zmz.demo.controller;

import com.tiger.zmz.demo.entity.Account;
import com.tiger.zmz.demo.service.IAccountService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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

    /**
     * @api {POST} /add 创建账户
     * @apiGroup Accound
     * @apiVersion 1.0.0
     * @apiDescription 用于注册用户
     * @apiParam {Account} account 账户对象
     * @apiParamExample {json} 请求示例：
     *                              {"name":"zhangsan", "money":1000}
     * @apiSuccess (200) {int} code 0成功 1失败
     * @apiSuccess (200) {String} msg 信息
     */
    @ApiOperation(value = "创建账户", notes = "创建账户")
    @ApiImplicitParam(name = "account", value = "账户实体", required = true, dataType = "Account")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int add(@RequestBody Account account) {
        return accountService.add(account);
    }

    @ApiOperation(value = "更新账户", notes = "更新账户信息")
    @ApiImplicitParam(name = "account", value = "账户实体", required = true, dataType = "Account")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public int update(@RequestBody Account account) {
        return accountService.update(account);
    }

    @ApiOperation(value = "删除账户", notes = "通过id删除账户")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "int", paramType = "path")
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public int delete(@RequestParam(value = "id", required = true) int id) {
        return accountService.delete(id);
    }

    @ApiOperation(value = "查找账户", notes = "通过id查找账户")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "int", paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account findAccountById(@PathVariable("id") int id) {
        return accountService.findAccountById(id);
    }

    @ApiOperation(value = "列出账户", notes = "列出所有账户")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> findAccountList() {
        return accountService.findAccountList();
    }

    @ApiOperation(value = "测试缓存", notes = "通过id查找账户")
    @RequestMapping(value = "/cache", method = RequestMethod.GET)
    public void testCacheQuery() {
        System.out.println(accountService.testCacheQuery(1).toString());
        System.out.println(accountService.testCacheQuery(2).toString());
        System.out.println(accountService.testCacheQuery(3).toString());
        System.out.println(accountService.testCacheQuery(4).toString());
    }
}
