package SportsEventManager.API.api_sporting_events.dto;

import SportsEventManager.API.api_sporting_events.enums.Modality;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestAthleteDTO(

        @NotBlank(message = "Nome é obrigatório! ")
        String name,

        @Min(value = 18, message = "Idade mínima é 18! ")
        Integer age,

        @NotNull(message = "Modalidade é obrigatório! ")
        Modality modality,

        @NotNull(message = "Ranking é obrigatório! ")
        Integer ranking

) {
}
