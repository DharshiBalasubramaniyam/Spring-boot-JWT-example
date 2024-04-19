package com.dharshi.jwtExample.controller;

import com.dharshi.jwtExample.Services.AuthService;
import com.dharshi.jwtExample.dtos.ApiResponseDto;
import com.dharshi.jwtExample.dtos.SignInRequestDto;
import com.dharshi.jwtExample.dtos.SignUpRequestDto;
import com.dharshi.jwtExample.exceptions.RoleNotFoundException;
import com.dharshi.jwtExample.exceptions.UserAlreadyExistsException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<ApiResponseDto<?>> signUpUser(@RequestBody @Valid SignUpRequestDto signUpRequestDto)
            throws UserAlreadyExistsException, RoleNotFoundException {
        return authService.signUpUser(signUpRequestDto);
    }

    @PostMapping("/signin")
    public ResponseEntity<ApiResponseDto<?>> signInUser(@RequestBody @Valid SignInRequestDto signInRequestDto){
        return authService.signInUser(signInRequestDto);
    }

}
