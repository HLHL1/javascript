package com.forum.controller;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/5/27 0027 下午 16:35
 * @Created by Administrator
 */

import com.forum.pojo.Post;
import com.forum.pojo.UserInfo;
import com.forum.service.PostService;
import com.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 控制层
 * @author Nocol
 *
 */
@RequestMapping("/user")
@Controller
public class UserController {
    //注入Service
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;

    @RequestMapping("/regist")
    public String regist(@RequestParam("userName") String userName,@RequestParam("passWord") String passWord,Model model){
        String username1="";
        if (userService.findUserByName(userName)==null){
            username1="";
        }else {
            username1=userService.findUserByName(userName).getUserName();
        }
        if(userName.equals(username1)){
            model.addAttribute("msg", "用户名重复，请重新命名");
            return "registfail";
        }else{
            UserInfo userInfo=new UserInfo(0,userName,passWord);
            userService.addUser(userInfo);
            model.addAttribute("msg", "注册成功");
            return "registsuc";
        }
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request,@RequestParam("userName") String userName,@RequestParam("passWord") String passWord,Model model){
        UserInfo userInfo=userService.findUserByNameAndPwd(userName,passWord);
        String username2="";
        if (userService.findUserByNameAndPwd(userName,passWord)==null){
            username2="";
        }else {
            username2=userService.findUserByNameAndPwd(userName,passWord).getUserName();
        }
        if(username2.equals(userName)){
            //userService.userLogin(userName,1);
//            System.out.println("usercon:"+userInfo);
            request.getSession().setAttribute("msg",userInfo);
//            model.addAttribute("msg", userInfo);
            List<Post> posts = postService.getAllPost();
            model.addAttribute("msg3",posts);
            return "index";
        }else{
            model.addAttribute("msg", "登录失败");
            return "loginfail";
        }
    }

    @RequestMapping("/jump")
    public String jump(){
        return "issue";
    }

    @RequestMapping("/jump1")
    public String jump1(@RequestParam("postId") int postId,Model model){
        model.addAttribute("postId",postId);
        return "reply";
    }

    @RequestMapping("/userInfo")
    public String userInfo(HttpServletRequest request, @RequestParam("userName") String userName, Model model){
//        try {
//            String string= JsonUtil.objectToJson(userService.findUserByName(userName));
//            return string;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//            return "{\"message\":\"error\"}";
//        }
//        System.out.println("hahaha");
        UserInfo userInfo=userService.findUserByName(userName);
        System.out.println(request.getAttribute("msg"));
///        System.out.println(userInfo.getUserName());
        model.addAttribute("msg1",userInfo.getUserName());
        model.addAttribute("msg2",userInfo.getUserId());
        return "showUserInfo";
    }
}





