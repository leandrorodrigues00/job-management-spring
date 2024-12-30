package br.com.leandrorodrigues.gestao_vagas.modules.candidate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
@Entity(name = "candidate")
public class CandidateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Schema(example = "Leandro Rodrigues", requiredMode = Schema.RequiredMode.REQUIRED, description = "candidate's name")
    private String name;

    @Pattern(regexp = "\\S+", message = "The field [username] must not contain spaces")
    @Schema(example = "LeandroR", requiredMode = Schema.RequiredMode.REQUIRED, description = "candidate username")
    private String username;

    @Email(message = "The field [email] must contain a valid email")
    @Schema(example = "leandro@gmail.com", requiredMode = Schema.RequiredMode.REQUIRED, description = "candidate's email")
    private String email;

    @Length(min = 10, max = 100, message = "The field [password] must be between 10 and 100 characters")
    @Schema(example = "admin@1234", minLength = 10, maxLength = 100, requiredMode = Schema.RequiredMode.REQUIRED, description = "candidate password")
    private String password;

    @Schema(example = "Java developer")
    private String description;
    private String curriculum;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
