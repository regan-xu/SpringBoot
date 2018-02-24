package com.study.SpringBoot.forezp.dao;


import java.util.List;

import com.study.pojo.Account;

public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
