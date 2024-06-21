package br.com.eproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Entity
@Validated
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "addres_line_1", nullable = false, length = 525)
    private String addresLine1;

    @Column(name = "addres_line_2", length = 525)
    private String addresLine2;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country", nullable = false, length = 56)
    private String country;

    @Column(name = "state", length = 60, nullable = false)
    private String state;

    @Column(name = "cep", nullable = false, length = 9)
    private String cep;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private LocalUser user;



}
