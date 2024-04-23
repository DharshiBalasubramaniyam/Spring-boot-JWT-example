package com.dharshi.jwtExample.controller;

import com.dharshi.jwtExample.dtos.ApiResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/test")
public class TestController {

//    Only users with 'ROLE_USER' role can access this end point
    @GetMapping("/user")
    @PreAuthorize("hasRole('ROLE_USER')")
    public ResponseEntity<ApiResponseDto<?>> UserDashboard() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ApiResponseDto.builder()
                        .isSuccess(true)
                        .message("User dashboard!")
                        .build());
    }

    //    Only users with 'ROLE_ADMIN' role can access this end point'
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<ApiResponseDto<?>> AdminDashboard() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ApiResponseDto.builder()
                        .isSuccess(true)
                        .message("Admin dashboard!")
                        .build());
    }

    //    Only users with 'ROLE_SUPER_ADMIN' role can access this end point'
    @GetMapping("/superAdmin")
    @PreAuthorize("hasRole('ROLE_SUPER_ADMIN')")
    public ResponseEntity<ApiResponseDto<?>> SuperAdminDashboard() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ApiResponseDto.builder()
                        .isSuccess(true)
                        .message("Super Admin dashboard!")
                        .build());
    }

    //    Users with 'ROLE_SUPER_ADMIN' or 'ROLE_ADMIN' roles can access this end point'
    @GetMapping("/AdminOrSuperAdmin")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public ResponseEntity<ApiResponseDto<?>> AdminOrSuperAdminContent() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ApiResponseDto.builder()
                        .isSuccess(true)
                        .message("Admin or Super Admin Content!")
                        .build());
    }
}
