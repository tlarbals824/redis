package com.sim.redistest.domain.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sim.redistest.domain.user.repository.UserRepository;
import com.sim.redistest.domain.user.service.dto.UserDto;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

	private final UserQueryService userQueryService;
	private final UserRepository userRepository;

	public UserDto.UserInfoDto getUserInfo(Long userId){
		return UserDto.UserInfoDto.of(userQueryService.findById(userId));
	}

	public void saveUser(UserDto.UserSaveDto userSaveDto){
		userRepository.save(userSaveDto.toEntity());
	}


}
