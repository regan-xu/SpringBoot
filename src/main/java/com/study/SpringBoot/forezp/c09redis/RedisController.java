package com.study.SpringBoot.forezp.c09redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.SpringBoot.forezp.dao.impl.RedisDao;

@RestController
@RequestMapping("/redis")
public class RedisController {

	public static Logger logger= LoggerFactory.getLogger(RedisController.class);
			
	@Autowired
	RedisDao redisDao;
	
	@RequestMapping("/name")
	public String getName() {
//		redisDao.setKey("test_name", "dfasdfasdfasdfasd");
		return redisDao.getValue("test_name");
	}
}
