package com.springmodulith.demo.exception;

import org.springframework.http.HttpStatus;

public record Response(String message, HttpStatus status) {

}
