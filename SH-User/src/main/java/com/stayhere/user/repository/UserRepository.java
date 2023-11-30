package com.stayhere.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stayhere.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
