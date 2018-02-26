package com.study.SpringBoot.forezp.c6mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.SpringBoot.forezp.service.impl.AccountMybatisService2;

@RestController
@RequestMapping("/mybatis")
@MapperScan("com.study.SpringBoot.forezp.dao.mapper")//如果多个：@MapperScan({"com.kfit.demo","com.kfit.user"})
public class MybatisController2 {
    @Autowired
    AccountMybatisService2 accountService;

    @RequestMapping(value = "/transfer", method = RequestMethod.GET)
    public void transfer(){
        accountService.transfer();
    }
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public  List<Map<String, Object>> all(){
        return accountService.selectAll();
    }
}
