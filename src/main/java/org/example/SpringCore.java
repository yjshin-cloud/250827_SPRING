package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCore {
    public static void main(String[] args) {
        System.out.println("----- 스프링 컨테이너 초기화 시작 -----");

        // context ? -> 앱 설정. AppConfig? SpringConfig?
        // Bean...
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            System.out.println("----- 스프링 컨테이너 초기화 완료 -----");
            System.out.println();
            // Spring Container
            OrderService orderService = context.getBean(OrderService.class);

            orderService.processOrder("치킨");
        }
    }
}