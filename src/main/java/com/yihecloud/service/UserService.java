package com.yihecloud.service;

import com.yihecloud.dto.User;

import java.util.List;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-05-05
 */
public interface UserService {

    String sayHello(String name);

    User getUser(String id);

    List<User> queryUsers();

    int addUser(User user);

}
