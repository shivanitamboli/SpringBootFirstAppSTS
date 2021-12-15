package com.example.springbootfirstappsts;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HelloWorldController {
    @GetMapping("/web")
    public String hello() {
        return "hello";
    }
}
