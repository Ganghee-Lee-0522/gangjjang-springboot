package com.gangjjang.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// @EnableJpaAuditing 테스트를 위해 삭제, JpaConfig 생성
@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
