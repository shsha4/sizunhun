package com.side.sizunhun.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations = RestController.class)
@Log4j2
public class RestControllerConfig {

    @ExceptionHandler(NullPointerException.class)
    public Object nullPointerHandler(Exception e) {
        log.error(e.getClass());
        log.error(e.getMessage());

        return "NullPointer Exception Thrown";
    }

}
