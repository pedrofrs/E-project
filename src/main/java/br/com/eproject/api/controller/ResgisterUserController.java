package br.com.eproject.api.controller;

import br.com.eproject.api.model.RegisterUserBody;
import br.com.eproject.exception.UserAlreadyExistException;
import br.com.eproject.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class ResgisterUserController {

    private UserService userService;

    public ResgisterUserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity registerUser(@Validated @RequestBody RegisterUserBody registerUserBody){
        try {
            userService.registerUser(registerUserBody);
            return ResponseEntity.ok().build();
        } catch (UserAlreadyExistException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }


    }

}
