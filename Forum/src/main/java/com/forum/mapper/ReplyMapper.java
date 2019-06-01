package com.forum.mapper;

import com.forum.pojo.Floor;
import com.forum.pojo.Post;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyMapper {

    @Select("select * from post where creator=#{userName}")
    public Post whoPost(@Param("creator") String userName);

    @Insert("insert into floor(postId,content,userName) values(#{floor.postId},#{floor.content},#{floor.userName})")
    public void addFloor(@Param("floor") Floor floor);
}
