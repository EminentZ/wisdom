package cn.hwsoft.app.controller;

import cn.hwsoft.wisdom.core.domain.User;
import cn.hwsoft.wisdom.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Lenovo on 2019/7/10.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;//注入service层
    @RequestMapping("/register")
    public String register(User user){
        userService.register(user);
        return "/users/index"; //测试，后面要改
    }
}
