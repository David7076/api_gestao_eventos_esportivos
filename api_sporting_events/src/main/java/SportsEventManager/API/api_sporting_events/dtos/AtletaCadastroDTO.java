package SportsEventManager.API.api_sporting_events.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtletaCadastroDTO(

        @NotBlank(message = "Nome é obrigatório")
        String nome,

        @Min(value = 18, message = "Idade mínima é 18")
        Integer idade,

        @NotBlank
        String modalidade,

        Integer ranking

) {
}
