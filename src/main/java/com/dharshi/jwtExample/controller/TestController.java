package com.dharshi.jwtExample.controller;

import com.dharshi.jwtExample.dtos.ApiResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/test")
public class TestController {
//    @GetMapping("/")
//    public ResponseEntity<ApiResponseDto<?>> Test() {
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(new ApiResponseDto<>(true, "Let's learn spring security with JWT!"));
//    }
}
