package com.forum.service;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2019/5/27 0027 下午 16:55
 * @Created by Administrator
 */

import com.forum.mapper.UserMapper;
import com.forum.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务层
 * @author Nocol
 *
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser(UserInfo user) {
        userMapper.addUser(user);
    }

    public UserInfo findUserByNameAndPwd(String userName,String passWord) {
        return userMapper.findUserByNameAndPwd(userName,passWord);
    }

    public UserInfo findUserByName(String userName){
        return userMapper.findUserByName(userName);
    }

    public void userLogin(String userName,int islogin){
        userMapper.userLogin(userName,islogin);
    }
}