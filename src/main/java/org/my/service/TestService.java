package org.my.service;

import java.util.HashMap;
import java.util.Map;

import org.my.dao.redis.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	private RedisDao redisDao;
	
	public Map<String, Object> insert(String key, String field, String value) {
		Map<String, Object> data = new HashMap<>();
		data.put(field, value);
		redisDao.insert(key, data);
		return data;
	}
}
