package com.hcl.ecart.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hcl.ecart.dto.UserResponseDto;
import com.hcl.ecart.dto.UserRequestDto;
import com.hcl.ecart.entity.UserEntity;
import com.hcl.ecart.repository.userRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	userRepo userRep;
	
	@Autowired
	UserResponseDto userResponseDto;
	
	@Override
	public UserResponseDto addUser(UserRequestDto userRequestDto) {
		
		UserEntity userEntity =new UserEntity();
		BeanUtils.copyProperties(userRequestDto, userEntity);
		userRep.save(userEntity);
		
		UserResponseDto userResponseDto = new UserResponseDto();
		userResponseDto.setMessage("Added successfully");
		userResponseDto.setStatusCode(HttpStatus.CREATED.value());
		return userResponseDto;
	}

}





