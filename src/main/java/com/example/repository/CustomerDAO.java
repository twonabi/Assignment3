package com.example.repository;

import com.example.entity.CustomerDTO;
import com.example.entity.ProductsDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.sql.*;
import java.util.List;

public class CustomerDAO {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try{
            String resource = "mybatis-config/config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public List<CustomerDTO> customerList(){
        SqlSession session = sqlSessionFactory.openSession();
        List<CustomerDTO> list=session.selectList("customerList");
        session.close();
        return list;
    }

}



