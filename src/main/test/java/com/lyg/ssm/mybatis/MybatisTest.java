package com.lyg.ssm.mybatis;

import com.lyg.ssm.domain.User;
import com.lyg.ssm.mapper.IAccountMapper;
import com.lyg.ssm.mapper.IUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {


    @Test
    public void test1() throws IOException {


        //1 读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        //2 获取SQL Session

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        IUserMapper userMapper = sqlSession.getMapper(IUserMapper.class);

        IAccountMapper accountMapper= sqlSession.getMapper(IAccountMapper.class);



        List<User> users = userMapper.findAll();

        for (User user : users) {
            System.out.println(user);
        }
    }
}
