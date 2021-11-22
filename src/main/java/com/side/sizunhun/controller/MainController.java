package com.side.sizunhun.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Log4j2
@RequiredArgsConstructor
public class MainController {

    @GetMapping("test")
    public String testPage() {
        return "testpage loaded..";
    }

    @GetMapping("/test2")
    public String nullPointerTester() {

        throw new NullPointerException("TEST");
    }

    @GetMapping("/test3")
    public ResponseEntity<Object> responseTest() {      // => text/plain 형식으로 response

        return ResponseEntity.ok("FJDKJS");
    }

    @GetMapping("/test4")
    public ResponseEntity<Object> responseTest2() {     // => application/json 형식으로 response
        Map<String, String> result = new HashMap<>();
        result.put("Key", "VALUE");
        result.put("key2", "value2");

        return ResponseEntity.ok(result);
    }
}
