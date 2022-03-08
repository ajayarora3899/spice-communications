package com.spice.communication.spicecommunications.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = SpiceBaseException.class)
    public ResponseEntity handleSpiceBaseException(SpiceBaseException exception) {
        ExceptionResponseVO exceptionResponseVO = new ExceptionResponseVO(exception.getErrorCode(), exception.getMessage());
        return new ResponseEntity(exceptionResponseVO, HttpStatus.BAD_REQUEST);
    }
}
