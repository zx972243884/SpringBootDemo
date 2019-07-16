package com.zx.sys.dao;

import com.zx.sys.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserDao {

    int InsertUser(UserEntity user);

    int UpdateUser(UserEntity user);

    int DeleteUser(int id);

    UserEntity GetUserInfoById(int id);

    List<UserEntity> GetUserList();
}
