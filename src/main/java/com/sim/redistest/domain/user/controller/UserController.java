package com.sim.redistest.domain.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sim.redistest.domain.user.service.UserService;
import com.sim.redistest.domain.user.service.dto.UserDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

	private final UserService userService;

	@GetMapping
	public UserDto.UserInfoDto getUserInfo(@RequestParam Long userId){
		return userService.getUserInfo(userId);
	}

	@PostMapping
	public void saveUser(@RequestBody UserDto.UserSaveDto userSaveDto){
		userService.saveUser(userSaveDto);
	}


}
