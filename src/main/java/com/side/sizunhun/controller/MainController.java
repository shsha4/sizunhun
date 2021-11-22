package com.side.sizunhun.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class MainController {

    @GetMapping("test")
    public String testPage() {
        return "testpage loaded..";
    }
}
