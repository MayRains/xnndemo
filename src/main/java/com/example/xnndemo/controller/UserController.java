package com.example.xnndemo.controller;


import com.example.xnndemo.pojo.User;
import com.example.xnndemo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping(value = "login")
//    public String getIndex(){
//        return "index";
//    }

    @RequestMapping(value = "loginC", method = RequestMethod.POST)
    public String handleLogin(@Param("username") String username,@Param("password") String password){
        User demo = userService.loginByName(username);
        if (demo.getPassword().equals(password)){
            System.out.println("验证通过");
            return "success";
        }else{
            System.out.println(demo.getName()+demo.getPassword());
            return "fail";
        }
    }
}
