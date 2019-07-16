package com.zx.sys.dao;

import com.zx.sys.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void insertUserTest(){
        UserEntity user = new UserEntity();
        user.setName("张三");
        user.setAge(10);

        int id = userDao.InsertUser(user);
        System.out.println("id = "+id);
    }
}