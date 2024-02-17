package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(IoC) 스프링 컨테이너에 관리해준다
public class BlogController {

    @GetMapping("test/hello")
    public @ResponseBody String hello() {
        return "<h1>Hello World</h1>";
    }
}
