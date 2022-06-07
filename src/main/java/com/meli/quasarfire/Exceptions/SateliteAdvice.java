package com.meli.quasarfire.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SateliteAdvice {
    @ResponseBody
    @ExceptionHandler(EquationsException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String sateliteHandler(SateliteException ex) {
        return ex.getMessage();
    }
}
