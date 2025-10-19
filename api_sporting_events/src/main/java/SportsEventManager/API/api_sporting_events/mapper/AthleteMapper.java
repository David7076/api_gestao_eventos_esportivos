package SportsEventManager.API.api_sporting_events.mapper;

import SportsEventManager.API.api_sporting_events.dto.RequestAthleteDTO;
import SportsEventManager.API.api_sporting_events.dto.ResponseAthleteDTO;
import SportsEventManager.API.api_sporting_events.entity.AthleteEntity;

public class AthleteMapper {
    public static AthleteEntity toEntity(RequestAthleteDTO dto) {
        if(dto == null) return null;
        AthleteEntity entity = new AthleteEntity();
        entity.setName(dto.name());
        entity.setAge(dto.age());
        entity.setModality(dto.modality());
        entity.setRanking(dto.ranking());
        return entity;
    }

    public static ResponseAthleteDTO toDTO(AthleteEntity entity) {
        if(entity == null) return null;
        return new ResponseAthleteDTO(
                entity.getId(),
                entity.getName(),
                entity.getAge(),
                entity.getModality(),
                entity.getRanking()
        );

    }
}
