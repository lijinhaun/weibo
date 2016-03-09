package com.weibo.util;

import redis.clients.jedis.Jedis;


public class SessionUtil {
	
	
	public static void setSession(byte[] key,byte[] value){
		JedisUtil.set(key, value);
	}
	public static void setSession(String key,String value){
		JedisUtil.set(key, value);
	}
	
	public static byte[] getSession(byte[] key){
		return JedisUtil.get(key);
	}
	
	public static Object getSession(String key){
		return JedisUtil.get(key);
	}
}
