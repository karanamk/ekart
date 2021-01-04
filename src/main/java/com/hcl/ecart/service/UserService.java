package com.hcl.ecart.service;

import com.hcl.ecart.dto.UserRequestDto;
import com.hcl.ecart.dto.UserResponseDto;

public interface UserService {
	
	public UserResponseDto addUser(UserRequestDto userRequestDto);
	

}
