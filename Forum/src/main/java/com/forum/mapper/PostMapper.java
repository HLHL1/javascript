package com.forum.mapper;

import com.forum.pojo.Post;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname PostMapper
 * @Description TODO
 * @Date 2019/5/28 0028 下午 19:41
 * @Created by Administrator
 */
@Repository
public interface PostMapper {

    @Select("select * from post")
    public List<Post> getAllPost();

    @Select("select * from post where postId=#{postId}")
    public Post selectPostByPostId(@Param("postId") int postId);
}
