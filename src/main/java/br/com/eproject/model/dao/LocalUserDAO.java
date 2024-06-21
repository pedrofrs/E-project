package br.com.eproject.model.dao;

import br.com.eproject.model.LocalUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LocalUserDAO extends CrudRepository<LocalUser,Long> {

    Optional<LocalUser> findByUsername(String username);

    Optional<LocalUser> findByEmail(String email);

    Optional<LocalUser> findByCpf(String cpf);
}
