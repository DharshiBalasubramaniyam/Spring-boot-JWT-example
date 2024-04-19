package com.dharshi.jwtExample.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponseDto<T> {

    private boolean isSuccess;
    private String message;
    private T data;

    public ApiResponseDto(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }
}