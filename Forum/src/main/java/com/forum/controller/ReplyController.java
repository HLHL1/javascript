package com.forum.controller;

import com.forum.pojo.Floor;
import com.forum.pojo.Post;
import com.forum.service.FloorService;
import com.forum.service.PostService;
import com.forum.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/index")
public class ReplyController {
    @Autowired
    private ReplyService replyService;
    @Autowired
    private FloorService floorService;
    @Autowired
    private PostService postService;

    @RequestMapping("/reply")
    public String huifu(@RequestParam("content") String content,@RequestParam("postId") int postId, @RequestParam("userName") String userName, Model model) {

//            Post post=replyService.whoPost(userName);
            Floor floor = new Floor(0,postId,content,userName);
            replyService.addFloor(floor);
            //前端显示
            List<Floor> floors=floorService.selectFloorByPostId(postId);
            Post post=postService.selectPostByPostId(postId);
            model.addAttribute("msg4",floors);
            model.addAttribute("msg5",post);
            return "showPost";

    }
}
