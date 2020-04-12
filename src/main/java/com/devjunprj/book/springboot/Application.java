package com.devjunprj.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


//@EnableJpaAuditing 삭제됨  // JPA Auditing 활성화
@SpringBootApplication
// 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
// @SpringBootApplication이 있는 위치부터 설정을 읽어가기 때문에 항상 프로젝트 최상단에 위치해야 함
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        // 내장 WAS를 실행
        // 톰캣을 실행할 필요가 없게 되고 스프링 부트로 만들어진 JAR 파일로 실행 하면 됨

    }
}
