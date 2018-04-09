package com.yihecloud.cntroller;

import com.yihecloud.dto.User;
import com.yihecloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-05-05
 */
@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(String name){
        return userService.sayHello(name);
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(String id) {
        return userService.getUser(id);
    }

    @RequestMapping("/queryUsers")
    @ResponseBody
    public List<User> queryUsers() {
        return userService.queryUsers();
    }

    @RequestMapping("addUser")
    @ResponseBody
    public int addUser() {
        User user = new User(null, "chenxyz", 20);
        return userService.addUser(user);
    }
}
