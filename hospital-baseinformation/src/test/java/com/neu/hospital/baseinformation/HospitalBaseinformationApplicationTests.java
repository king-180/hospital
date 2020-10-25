package com.neu.hospital.baseinformation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.UUID;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HospitalBaseinformationApplication.class)
public class HospitalBaseinformationApplicationTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void contextLoads() {
//        int a = 3;
//        int b = 2;
//        a = a ^ b;
//        b = a ^ b;
//        a = b ^ a;
//        System.out.println(a + " " + b);
//        String str1 = "i";
//        String str2 = new String("i");
//        System.out.println(str1.equals(str2));
//        System.out.println(str1 == str2);
    }

    @Test
    public void testRedis() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("hello", "world_" + UUID.randomUUID().toString());
        String hello = ops.get("hello");
        System.out.println("保存的数据是：" + hello);
    }


}
