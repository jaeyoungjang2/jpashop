package jpabook.jpashop.service;

import jpabook.jpashop.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class OrderService {
    private final OrderRepository orderRepository;

    /**
     * 주문
     */


    // 주문

    // 취소

    // 검색
}