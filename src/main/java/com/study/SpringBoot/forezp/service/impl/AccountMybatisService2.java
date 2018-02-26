package com.study.SpringBoot.forezp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.SpringBoot.forezp.dao.mapper.AccountMapper2;

@Service
public class AccountMybatisService2 {

    @Autowired
    AccountMapper2 accountMapper2;

    @Transactional
    public void transfer() throws RuntimeException{
        accountMapper2.update(90.0,1);//用户1减10块 用户2加10块
        accountMapper2.update(110.0,2);
    }
    
    public List<Map<String, Object>> selectAll() {
		return accountMapper2.selectAll();
	}
}
