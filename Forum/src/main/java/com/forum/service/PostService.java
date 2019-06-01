package com.forum.service;

import com.forum.mapper.PostMapper;
import com.forum.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname PostService
 * @Description TODO
 * @Date 2019/5/28 0028 下午 19:40
 * @Created by Administrator
 */
@Service
public class PostService {
    @Autowired
    private PostMapper postMapper;

    public List<Post> getAllPost(){return postMapper.getAllPost();}

    public Post selectPostByPostId(int postId){return postMapper.selectPostByPostId(postId);}
}
