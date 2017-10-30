package com.example.mybatisdemo2.demo;

import com.example.mybatisdemo2.demo.dao.UserMapper;
import com.example.mybatisdemo2.demo.entity.UserEntity;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private SqlSession sqlSession;

	@Test
	public void contextLoads() {
	}

	@Test
	public void  test(){
		UserEntity entity = new UserEntity() ;
		entity.setAge(10);
		entity.setName("zzzz");
		userMapper.insert(entity);
	}
}
