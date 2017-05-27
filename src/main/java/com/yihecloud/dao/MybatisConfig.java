package com.yihecloud.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description
 *
 * @author chenlinchao
 * @version 1.0
 * @date 2017-05-27
 * Copyright 青海粮食云项目组
 */
@Configuration
@MapperScan(basePackages = "com.yihecloud.dao")
public class MybatisConfig {

}
