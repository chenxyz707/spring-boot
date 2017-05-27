package com.yihecloud.dao;

import com.yihecloud.dto.User;
import org.springframework.stereotype.Repository;

/**
 * Description
 *
 * @author chenlinchao
 * @version 1.0
 * @date 2017-05-27
 * Copyright 青海粮食云项目组
 */
@Repository
public interface UserDao {
    int add(User user);
}
