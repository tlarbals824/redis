package com.sim.redistest.controller;

import java.util.Map;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class RedisController {

	private final RedisTemplate<String, Object> redisTemplate;

	@PostMapping("/redis")
	public String setRedisData(@RequestBody Map<String, String> map){
		redisTemplate.opsForValue().set(map.get("key"), map.get("value"));

		return "success";
	}

	@GetMapping("/data")
	public String getRedisData(@RequestParam String key){
		return (String) redisTemplate.opsForValue().get(key);
	}
}
