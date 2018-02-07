package com.yihecloud.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-05-27
 */
@Configuration
@MapperScan(basePackages = "com.yihecloud.dao")
public class MybatisConfig {

}
