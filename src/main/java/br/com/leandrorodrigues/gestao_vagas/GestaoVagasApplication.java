package br.com.leandrorodrigues.gestao_vagas;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Job Management",
                description = "API responsible for job management"
        )
)
public class GestaoVagasApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestaoVagasApplication.class, args);
    }

}
