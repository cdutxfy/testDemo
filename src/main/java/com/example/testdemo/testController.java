package com.example.testdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class testController {
    @RequestMapping("/index")
    @ResponseBody
    String index() {
        return "Hello Spring Boot";
    }
}
