package com.forum.mapper;

import com.forum.pojo.Floor;
import com.forum.pojo.Post;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueMapper {

    @Select("select islogin from userinfo where userName=#{userName}")
    public int userIsLogin(@Param("creator") String userName);

    @Insert("insert into post(headLine,content,creator) values(#{post.headLine},#{post.content},#{post.creator})")
    @Options(useGeneratedKeys = true,keyProperty = "post.postId",keyColumn = "post_id")
    public void addPost(@Param("post") Post post);

    @Insert("insert into floor(postId,content,user) values(#{floor.postId},#{floor.content},#{floor.user})")
    @Options(useGeneratedKeys = true,keyProperty = "floor.floorId",keyColumn = "floor_id")
    public void addFirstFloor(@Param("floor") Floor floor);
}
