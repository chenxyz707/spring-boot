package com.yihecloud.service.impl;

import com.yihecloud.User;
import com.yihecloud.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author chenlinchao
 * @version 1.0
 * @date 2017-05-05
 * Copyright 青海粮食云项目组
 */
@Service
public class UserServiceimpl implements UserService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name +"!";
    }

    @Override
    public User getUser(String id) {
        User user = new User();
        switch(id) {
            case "1" : user = new User("1", "Tom", 18); break;
            case "2" : user = new User("2", "Hack", 13); break;
            case "3" : user = new User("3", "Jimmy", 16); break;
        }
        return user;
    }

    @Override
    public List<User> queryUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("1", "Tom", 18));
        list.add(new User("2", "Hack", 13));
        list.add(new User("3", "Jimmy", 16));
        return list;
    }
}
