package com.yihecloud.service;

import com.yihecloud.dto.User;

import java.util.List;

/**
 * Description
 *
 * @author chenlinchao
 * @version 1.0
 * @date 2017-05-05
 * Copyright 青海粮食云项目组
 */
public interface UserService {

    String sayHello(String name);

    User getUser(String id);

    List<User> queryUsers();

    int addUser(User user);

}
