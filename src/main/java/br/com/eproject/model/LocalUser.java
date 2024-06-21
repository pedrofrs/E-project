package br.com.eproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Validated
@Entity()
@Table(name = "local_user")
public class LocalUser {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", length = 1000, nullable = false)
    private String password;

    @Column(name = "email", unique = true, nullable = false)
    @Email
    private String email;

    @Column (name = "fist_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastname;

    @Column(name = "phone",nullable = false)
    private String phone;

    @Column(name = "cpf")
    @CPF
    private String cpf;

    @Column(name = "birth", nullable = false)
    private String birth;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Address> addresses = new ArrayList<>();


}
