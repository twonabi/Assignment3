package com.example.repository;


import com.example.entity.ProductsDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class ProductsDAO {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config/config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<ProductsDTO> productsList(){
        SqlSession session = sqlSessionFactory.openSession();
        List<ProductsDTO> list=session.selectList("productsList");
        session.close();
        return list;
    }

    public void productsInsert(ProductsDTO dto) {
    }
}
