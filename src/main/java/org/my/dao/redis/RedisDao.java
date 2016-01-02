package org.my.dao.redis;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisDao {
	@Autowired
	private StringRedisTemplate template;
	
	public void insert(String key, Map<String, Object> data) {
		BoundHashOperations<String, String, Object> ops = template.boundHashOps(key);
		ops.putAll(data);
	}
	public Map<String, Object> select(String key, String field) {
		return null;
	}
}
