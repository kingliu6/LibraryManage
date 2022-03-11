package org.example.sql;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;


public class SqlUtil {
    private SqlUtil(){}
    private static SqlSessionFactory factory;
    static {
            try {
                factory= new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    public SqlSession getSession(){
        return factory.openSession(true);
    }
}
