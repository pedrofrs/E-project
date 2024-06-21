package br.com.eproject.api.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

@Getter
@Setter
public class RegisterUserBody {

    @NotBlank(message = "Username is mandatory")
    @NotNull
    @Size(max = 30, min = 6)
    private String username;

    @NotBlank(message = "Password is mandatory")
    @Length(max = 1000, message = "Password length must be less than or equal to 1000 characters")
    private String password;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "First name is mandatory")
    @Size(max = 255, min = 2)
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    @Size(max = 300, min = 2)
    private String lastName;

    @NotBlank(message = "Phone is mandatory")
    @NotNull
    private String phone;

    @CPF(message = "CPF should be valid")
    private String cpf;

    @NotBlank(message = "Birth date is mandatory")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Birth date should be in the format YYYY-MM-DD")
    private String birth;
}
