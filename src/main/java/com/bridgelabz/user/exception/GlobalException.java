package com.bridgelabz.user.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bridgelabz.user.Response;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(value = EmpException.class)
    public String userAlreadyExist(EmpException empException) {
        return empException.getMessage();
	}

}
