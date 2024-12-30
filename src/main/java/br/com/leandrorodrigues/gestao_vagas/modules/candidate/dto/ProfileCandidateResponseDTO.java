package br.com.leandrorodrigues.gestao_vagas.modules.candidate.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {

    @Schema(example = "Java developer")
    private String description;

    @Schema(example = "joao")
    private String username;

    @Schema(example = "joao@gmail.com")
    private String email;
    private UUID id;

    @Schema(example = "Joao de Souza")
    private String name;
}
