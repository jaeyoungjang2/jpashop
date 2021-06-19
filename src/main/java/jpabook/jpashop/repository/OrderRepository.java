package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class OrderRepository {

    private final EntityManager em;

    public OrderRepository(EntityManager em) {
        this.em = em;
    }

    // 주문 저장 //
    public void save(Order order) {
        em.persist(order);
    }

    // 주문 단건 조회 //
    public Order findOne(Long id) {
        return em.find(Order.class, id);
    }

    // 주문 내역 검색, 주문 상태 검색 //
    //    public List<Order> findAll(OrderSearch orderSearch){
//
//        }
}
