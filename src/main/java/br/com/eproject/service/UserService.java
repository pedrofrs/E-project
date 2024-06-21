package br.com.eproject.service;

import br.com.eproject.api.model.RegisterUserBody;
import br.com.eproject.exception.UserAlreadyExistException;
import br.com.eproject.model.LocalUser;
import br.com.eproject.model.dao.LocalUserDAO;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private LocalUserDAO localUserDAO;
    private EncryptionService encryptionService;

    public UserService(LocalUserDAO localUserDAO, EncryptionService encryptionService) {
        this.localUserDAO = localUserDAO;
        this.encryptionService = encryptionService;
    }

    public LocalUser registerUser(RegisterUserBody registerUserBody) throws UserAlreadyExistException {

        if (localUserDAO.findByUsername(registerUserBody.getUsername()).isPresent()
        || localUserDAO.findByCpf(registerUserBody.getCpf()).isPresent()
        || localUserDAO.findByEmail(registerUserBody.getEmail()).isPresent())
        {
            throw new UserAlreadyExistException();
        }

        LocalUser localUser = new LocalUser();
        localUser.setUsername(registerUserBody.getUsername());
        localUser.setCpf(registerUserBody.getCpf());
        localUser.setFirstName(registerUserBody.getFirstName());
        localUser.setLastname(registerUserBody.getLastName());
        localUser.setPhone(registerUserBody.getPhone());
        localUser.setBirth(registerUserBody.getBirth());
        localUser.setPassword(encryptionService.encryptPassword(registerUserBody.getPassword()));
        localUser.setEmail(registerUserBody.getEmail());

        return localUserDAO.save(localUser);


    }
}
