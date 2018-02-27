package com.study.SpringBoot.forezp.c04jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.SpringBoot.forezp.dao.AccountJpaDao;
import com.study.SpringBoot.forezp.entity.AccountJpa;

@RestController
@RequestMapping("/jpa")
public class JpaController {

    @Autowired
    AccountJpaDao accountJpaDao;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<AccountJpa> getAccounts() {
        return accountJpaDao.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public AccountJpa getAccountById(@PathVariable("id") int id) {
        return accountJpaDao.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
    	AccountJpa account = new AccountJpa();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        AccountJpa account1 = accountJpaDao.saveAndFlush(account);

        return account1.toString();

    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
    	AccountJpa account = new AccountJpa();
        account.setMoney(money);
        account.setName(name);
        AccountJpa account1 = accountJpaDao.save(account);
        return account1.toString();

    }


}
