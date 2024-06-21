package br.com.eproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user_order_quantity")
public class UserOrderQuantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "producy_quantity", nullable = false)
    private Integer productQuantity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private UserOrder order;

}
