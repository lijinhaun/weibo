package com.weibo.service;

import com.weibo.model.User;

public interface UserService {
	User selectUserByPwdAndName(User user);
}
