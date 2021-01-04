package com.hcl.ecart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ecart.entity.UserEntity;

public interface userRepo extends JpaRepository<UserEntity, Integer>{

}
