package br.com.leandrorodrigues.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;


@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @Pattern(regexp = "\\S+", message = "The field [username] must not contain spaces")
    private String username;

    @Email(message = "The field [email] must contain a valid email")
    private String email;

    @Length(min = 10, max = 100, message = "The field [password] must be between 10 and 100 characters")
    private String password;
    private String description;
    private String curriculum;
}
