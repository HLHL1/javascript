package com.forum.service;

import com.forum.mapper.IssueMapper;
import com.forum.pojo.Floor;
import com.forum.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueService {
    @Autowired
    private IssueMapper issueMapper;

    public int userIsLogin(String userName){
      return issueMapper.userIsLogin(userName);
    }

    public void addPost(Post post) {
        issueMapper.addPost(post);
    }

    public void addFirstFloor(Floor floor) { issueMapper.addFirstFloor(floor);}
}
