package com.dharshi.jwtExample.Services;

import com.dharshi.jwtExample.dtos.ApiResponseDto;
import com.dharshi.jwtExample.dtos.SignInRequestDto;
import com.dharshi.jwtExample.dtos.SignUpRequestDto;
import com.dharshi.jwtExample.exceptions.RoleNotFoundException;
import com.dharshi.jwtExample.exceptions.UserAlreadyExistsException;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<ApiResponseDto<?>> signUpUser(SignUpRequestDto signUpRequestDto) throws UserAlreadyExistsException, RoleNotFoundException;

    ResponseEntity<ApiResponseDto<?>> signInUser(SignInRequestDto signInRequestDto);
}
