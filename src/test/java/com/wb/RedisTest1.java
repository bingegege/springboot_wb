package com.wb;

import com.google.gson.Gson;
import com.wb.domain.FivegManager;
import com.wb.mbg.model.FivegManagers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest1 {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void set(){
//        List<String> list=new LinkedList<>();
//        list.add("1");
//        list.add("2");
        Gson gson = new Gson();
        FivegManagers temp=new FivegManagers();
        temp.setUsername("1111");
        temp.setId(22);
        temp.setPassword("123");
        String temp1=gson.toJson(temp);
        redisTemplate.opsForValue().set("myKey5",temp1);
        System.out.println(redisTemplate.opsForValue().get("myKey5"));
    }
}
