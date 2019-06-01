package com.forum.service;

import com.forum.mapper.ReplyMapper;
import com.forum.pojo.Floor;
import com.forum.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyService {
    @Autowired
    private ReplyMapper replyMapper;

    public Post whoPost(String userName) { return replyMapper.whoPost(userName); }

    public void addFloor(Floor floor) { replyMapper.addFloor(floor); }



}
