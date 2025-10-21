package SportsEventManager.API.api_sporting_events.dto;

import SportsEventManager.API.api_sporting_events.enums.Modality;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestUpdateAthleteDTO(
        @NotNull
        Long id,

        String name,

        Integer age,

        Modality modality,

        Integer ranking
) {
}
