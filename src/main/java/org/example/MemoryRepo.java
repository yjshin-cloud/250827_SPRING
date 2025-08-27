package org.example;

import org.springframework.stereotype.Repository;

// @Component
@Repository
public class MemoryRepo {
    public void save(String data) {
        System.out.println("[MemoryRepo] 데이터 저장 %s".formatted(data));
    }
}