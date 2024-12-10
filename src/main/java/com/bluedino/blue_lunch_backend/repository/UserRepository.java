package com.bluedino.blue_lunch_backend.repository;

import com.bluedino.blue_lunch_backend.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
