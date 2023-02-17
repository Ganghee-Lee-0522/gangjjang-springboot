package com.gangjjang.book.springboot.domain.posts;

import com.gangjjang.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // 클래스 내 모든 필드의 Getter 메소드 자동 생성
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity // 테이블과 링크될 클래스임을 나타냄
public class Posts extends BaseTimeEntity {
    
    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성 규칙. GenerationType.IDENTITY은 auto_increment를 위한 것임
    private Long id;
    
    @Column(length = 500, nullable = false) // 테이블의 컬럼을 나타냄. 선언하지 않아도 해당 클래스의 필드는 모두 컬럼이 됨
    private String title;
    
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    
    private String author;
    
    @Builder // 해당 클래스의 빌더 패턴 클래스를 생성. 생성자 상단에 선언 시 생성장 포함된 필드만 빌더에 포함됨
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
