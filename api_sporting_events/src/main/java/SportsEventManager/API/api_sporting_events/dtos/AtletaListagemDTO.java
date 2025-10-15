package SportsEventManager.API.api_sporting_events.dtos;

import SportsEventManager.API.api_sporting_events.entities.AtletaEntity;

public record AtletaListagemDTO(

         Long id,

         String nome,

         Integer idade,

         String modalidade,

         Integer ranking


) {
}
