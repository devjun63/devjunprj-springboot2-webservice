package com.devjunprj.book.springboot.domain.posts;


import com.devjunprj.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter // 클래스 내 모든 필드에 Getter 메소드를 자동 생성
@NoArgsConstructor  // 기본 생성자 자동 추가 / public Posts() {} 같은 효과
@Entity // 테이블과 링크될 클래스임을 나타냄 / 기본값으로 클래스의 카멜케이스 이름을 던더스코어 네이밍으로 테이블 이름을 매칭합니다. ex) SalesManager.java -> sales_manager table
public class Posts extends BaseTimeEntity {

    @Id // 해당 테이블의 PK필드를 나타냅니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성 규칙, 스프링 부트 2.0 에서는 GenerationType.IDENTITY 옵션을 추가해야만 auto_increment
    private Long id;

    @Column(length = 500, nullable = false) // 테이블의 칼럼, 굳이 선언하지 않아도 해당 클래스의 필드는 모두 칼럼 but 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder   // 해당 클래스의 빌더 패턴 클래스를 생성 / 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
