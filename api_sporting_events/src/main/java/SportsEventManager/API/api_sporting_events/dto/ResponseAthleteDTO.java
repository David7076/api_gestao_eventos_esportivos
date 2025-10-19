package SportsEventManager.API.api_sporting_events.dto;

import SportsEventManager.API.api_sporting_events.entity.AthleteEntity;
import SportsEventManager.API.api_sporting_events.enums.Modality;

public record ResponseAthleteDTO(Long id, String name, Integer age, Modality modality, Integer ranking) {

    public ResponseAthleteDTO(AthleteEntity entity) {
        this(entity.getId(), entity.getName(), entity.getAge(), entity.getModality(), entity.getRanking());
    }
}
