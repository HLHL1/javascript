package com.forum.controller;

import com.forum.pojo.Post;
import com.forum.service.IssueService;
import com.forum.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/index")
public class IssueController {
    @Autowired
    private IssueService issueService;
    @Autowired
    private PostService postService;


//    @ResponseBody
//    public String all(FakeHttpServletResponse response, HttpServletRequest request) {
//        try {
//            request.setCharacterEncoding("utf-8");
//            response.setCharacterEncoding("utf-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            String str = JsonUtil.objectToJson(issueService.addPost())
//            return str;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//            return "{\"message\":\"error\"}";
//        }
//    }
    @RequestMapping("/issue")
    public String fatie(@RequestParam("headLine") String headLine, @RequestParam("content") String content,@RequestParam("creator") String userName, Model model) {

//        System.out.println("lalalalla");
                Post post = new Post(0,headLine,content,userName);
                issueService.addPost(post);
//                Floor floor = new Floor(0,1,content,post.getCreator());
//                issueService.addFirstFloor(floor);
                //前端显示
                List<Post> posts=postService.getAllPost();
                model.addAttribute("msg3",posts);
                return "index";

    }



}
