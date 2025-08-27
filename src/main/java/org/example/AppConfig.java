package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 설정 클래스
@ComponentScan("org.example") // 패키지
// com.example.demo
// 컴포넌트 -> Spring 의존성 주입 Bean -> Component
public class AppConfig {
    // @Bean ... ????
}