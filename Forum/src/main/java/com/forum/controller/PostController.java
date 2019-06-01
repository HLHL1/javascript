package com.forum.controller;

import com.forum.pojo.Post;
import com.forum.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Classname PostController
 * @Description TODO
 * @Date 2019/5/29 0029 下午 20:20
 * @Created by Administrator
 */
@RequestMapping("/post")
@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/all")
    public String all(Model model){
//        try {
//            String string= JsonUtil.objectToJson(postService.getAllPost());
//            return string;
//        } catch (JsonProcessingException e) {
//            e.printStackTgetCreator()race();
//            return "{\"message\":\"error\"}";
//        }
        List<Post> posts = postService.getAllPost();
        model.addAttribute("posts",posts);
        return "index";
    }

}
