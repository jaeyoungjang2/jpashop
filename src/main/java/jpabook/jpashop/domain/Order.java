package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "order")
    private List orderItems;

    @OneToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    private OrderStatus status;
}
