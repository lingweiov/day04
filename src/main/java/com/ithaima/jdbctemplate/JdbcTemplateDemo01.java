package com.ithaima.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author lingweiov
 * @create 2019-12-24-18:10
 */
public class JdbcTemplateDemo01 {
    public static void main(String[] args) {
        //准备数据源,spring的内置数据源
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/ff");
        ds.setUsername("root");
        ds.setPassword("admin");

        //1.创建JdbcTemplate对象
        JdbcTemplate jt=new JdbcTemplate(ds);
        //给jt设置数据源
        //jt.setDataSource(ds);
        //2.执行操做
        jt.execute("insert into account (name,money) VALUES ('ccc',1000)");
    }




}
