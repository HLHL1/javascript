package com.forum.controller;

import com.forum.pojo.Floor;
import com.forum.pojo.Post;
import com.forum.service.FloorService;
import com.forum.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Classname FloorController
 * @Description TODO
 * @Date 2019/5/29 0029 下午 21:39
 * @Created by Administrator
 */
@RequestMapping("/floor")
@Controller
public class FloorController {

    @Autowired
    private FloorService floorService;
    @Autowired
    private PostService postService;
    @RequestMapping("/getFloor")
    public String selectFloorByPostId(HttpServletRequest request, @RequestParam("postId")int postId, Model model){
//        try {
//            String string= JsonUtil.objectToJson(floorService.selectFloorByPostId(postId));
//            return string;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//            return "{\"message\":\"error\"}";
//        }

        List<Floor> floors=floorService.selectFloorByPostId(postId);
        Post post=postService.selectPostByPostId(postId);
//        request.getSession().setAttribute("msg4",floors);
//        request.getSession().setAttribute("msg5",post);
        model.addAttribute("msg4",floors);
        model.addAttribute("msg5",post);
        return "showPost";
    }
}
