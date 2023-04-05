package com.sim.redistest.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sim.redistest.domain.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
