package com.weibo.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.weibo.mapper.UserMapper;
import com.weibo.model.User;
import com.weibo.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	public User selectUserByPwdAndName(User user) {
		return userMapper.selectUserByPwdAndName(user);
	}
	
}
