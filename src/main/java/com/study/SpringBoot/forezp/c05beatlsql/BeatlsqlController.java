package com.study.SpringBoot.forezp.c05beatlsql;

import java.util.List;

/*
import org.beetl.sql.core.db.KeyHolder;
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.SpringBoot.forezp.dao.AccountBeatlsqlDao;
import com.study.pojo.Account;


@RestController
@RequestMapping("/beatlsql")
public class BeatlsqlController {
/*
    @Autowired
    AccountBeatlsqlDao accountBeatlsqlDao;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public  List<Account> getAccounts(){
       return accountBeatlsqlDao.all();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  Account getAccountById(@PathVariable("id") int id){
        return accountBeatlsqlDao.unique(id);
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public  Account getAccountById(@RequestParam("name") String name){
        return accountBeatlsqlDao.selectAccountByName(name);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public  String updateAccount(@PathVariable("id")int id , @RequestParam(value = "name",required = true)String name,
    @RequestParam(value = "money" ,required = true)double money){
    	Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t=accountBeatlsqlDao.updateById(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public  String postAccount( @RequestParam(value = "name")String name,
                                 @RequestParam(value = "money" )double money) {
    	Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        KeyHolder t = accountBeatlsqlDao.insertReturnKey(account);
        if (t.getInt() > 0) {
            return account.toString();
        } else {
            return "fail";
        }
    }
    */
}
