package br.com.eproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 300)
    private String name;

    @Column(name = "short_description", length = 300)
    private String shortDescription;

    @Column(name = "large_description", length = 1000)
    private String largeDescription;

    @Column(name = "price", nullable = false)
    private Double price;


    @OneToOne(mappedBy = "product", cascade = CascadeType.REMOVE, optional = false, orphanRemoval = true)
    private Inventory inventoty;

}