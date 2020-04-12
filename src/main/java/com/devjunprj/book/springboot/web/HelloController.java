package com.devjunprj.book.springboot.web;

import com.devjunprj.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON을 return 하는 Controller로 만들어 줌
                // ResponseBody를 각 메소드 마다 선언했던 것을 한번에 사용할 수 있게 해주는 격
public class HelloController {
    @GetMapping("/hello")   // HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줍니다.
                            // @RequesteMapping(method=RequestMethod.GET) 기능
                            // /hello로 요청이 오면 hello 문자열 반환하는 기능
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        // @RequestParam 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
        // 여기서는 외부에서 name (@RequestParam("name")) 이란 이름으로 넘긴 파라미터를 메소드 파라미터 name(String name)에 저장하게 됨
        return new HelloResponseDto(name, amount);
    }
}
