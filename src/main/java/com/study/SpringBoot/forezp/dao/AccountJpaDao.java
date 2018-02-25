package com.study.SpringBoot.forezp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.SpringBoot.forezp.entity.AccountJpa;



/*
 * 数据访问层，通过编写一个继承自 JpaRepository 的接口就能完成数据访问,
 * 其中包含了基本的单表查询的方法，非常的方便。
 * 值得注意的是，这个Account 对象名，而不是具体的表名，另外Interger是主键的类型，一般为Integer或者Long
 */
public interface AccountJpaDao  extends JpaRepository<AccountJpa,Integer> {
	
}
