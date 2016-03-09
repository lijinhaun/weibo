package com.weibo.mapper;

import com.weibo.model.User;

public interface UserMapper {

	User selectUserByPwdAndName(User user);
}
