package com.forum.mapper;

import com.forum.pojo.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2019/5/27 0027 下午 17:18
 * @Created by Administrator
 */
@Repository
public interface UserMapper {

    @Insert("insert into userinfo(userName,passWord) values(#{user.userName},#{user.passWord})")
    @Options(useGeneratedKeys = true,keyProperty="user.userId",keyColumn = "use_id")
    public void addUser(@Param("user") UserInfo user);

    @Select("select * from userinfo where userName=#{userName} and passWord=#{passWord}")
    public UserInfo findUserByNameAndPwd(@Param("userName") String userName,@Param("passWord") String passWord);

    @Select("select * from userinfo where userName=#{userName}")
    public UserInfo findUserByName(@Param("userName") String userName);

    @Insert("update userinfo set islogin=#{islogin} where userName=#{userName}")
    public void userLogin(@Param("userName")String userName,@Param("islogin") int islogin);
}
