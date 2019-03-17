package com.lyg.ssm.controller;


import com.lyg.ssm.domain.User;
import com.lyg.ssm.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuyangang
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("showList")
    public String showList(Model model){

        List<User> userList = userService.findAll();

        System.out.println(userList);
        //添加到域中
        model.addAttribute("userList",userList);
        return "user/list";



    }
}
