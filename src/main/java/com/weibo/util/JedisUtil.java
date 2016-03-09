package com.weibo.util;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisShardInfo;

public class JedisUtil {
	private static Jedis jedis;
	private static JedisPool jedisPool;
	public static void init(){
		GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
		poolConfig.setMaxIdle(1000);
		poolConfig.setMaxTotal(100);
		poolConfig.setMaxWaitMillis(5000);
		poolConfig.setMinIdle(10);
		jedisPool = new JedisPool(poolConfig, "192.168.1.118", 6379);
	}
	public static Jedis getJedis(){
		if(jedis == null){
			if(jedisPool == null){
				init();
			}
			jedis = jedisPool.getResource();
			jedis.auth("123456");
		}
		return jedis;
	}
	
	public static void set(String key,String value){
		if(jedis == null){
			getJedis();
		}
		jedis.set(key, value);
	}
	public static void set(byte[] key,byte[] value){
		if(jedis == null){
			getJedis();
		}
		if(jedis == null){
			getJedis();
		}
		jedis.set(key, value);
	}
	public static String get(String key){
		if(jedis == null){
			getJedis();
		}
		return jedis.get(key);
	}
	
	public static void lpush(String key,String ... strings){
		if(jedis == null){
			getJedis();
		}
		jedis.lpush(key, strings);
	}
	public static void lrange(String key,long start,long end){
		if(jedis == null){
			getJedis();
		}
		jedis.lrange(key, start, end);
	}
	
	public static void test(String key,String field,String value){
		if(jedis == null){
			getJedis();
		}
		jedis.hset(key, field, value);
	}
	public static byte[] get(byte[] key) {
		byte[] buff = null;
		if(jedis == null){
			getJedis();
		}
		buff = jedis.get(key);
		return buff;
	}
	
	
}

