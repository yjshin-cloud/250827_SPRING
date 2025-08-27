package org.example;

import org.springframework.stereotype.Service;

// @Component
@Service
public class OrderService {
    // DI
//    @Autowired
//    private MemoryRepo memoryRepo; // 필드 주입

    private final MemoryRepo memoryRepo; // 생성자 주입

    public OrderService(MemoryRepo memoryRepo) {
        System.out.println("[OrderService] 빈 생성 후 MemoryRepo 주입");
        this.memoryRepo = memoryRepo;
        // 생성자 -> 생성자 주입 -> Spring이 알아서 넣는다
    }

    public void processOrder(String item) {
        System.out.println("[OrderService] %s 주문을 처리".formatted(item));
        this.memoryRepo.save(item);
    }
}