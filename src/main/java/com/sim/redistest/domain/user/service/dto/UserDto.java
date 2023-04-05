package com.sim.redistest.domain.user.service.dto;

import com.sim.redistest.domain.user.entity.User;

import lombok.Getter;

public class UserDto {

	@Getter
	public static class UserInfoDto{
		private final String name;

		public UserInfoDto(String name) {
			this.name = name;
		}

		public static UserInfoDto of(User user) {
			return new UserInfoDto(user.getName());
		}
	}

	@Getter
	public static class UserSaveDto{
		private final String name;

		public UserSaveDto(String name) {
			this.name = name;
		}

		public User toEntity() {
			return User.builder().name(name).build();
		}
	}

}