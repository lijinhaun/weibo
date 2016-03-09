package com.weibo.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import redis.clients.jedis.Jedis;

import com.mysql.jdbc.StringUtils;
import com.weibo.model.User;
import com.weibo.service.UserService;
import com.weibo.util.JedisUtil;
import com.weibo.util.ObjectUtil;
import com.weibo.util.SessionUtil;

@Controller
public class UserAction {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.do")
	public String test(User user){
		User user1 = userService.selectUserByPwdAndName(user);
		if(user1 != null){
			byte[] key = ObjectUtil.object2Byte(user1.getId());
			byte[] value = ObjectUtil.object2Byte(user1);
			SessionUtil.setSession(key, value);
		}
		User user2 = (User) ObjectUtil.byte2Object( SessionUtil.getSession(ObjectUtil.object2Byte(user1.getId())));;
		System.out.println(user2);
		return "test";
	}
}
