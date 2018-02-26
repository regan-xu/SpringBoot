package com.study.SpringBoot.forezp.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;


public interface AccountMapper2 {
   int update( @Param("money") double money, @Param("id") int  id);

   List<Map<String, Object>> selectAll();
}
