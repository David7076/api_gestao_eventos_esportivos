package SportsEventManager.API.api_sporting_events.dtos;

import SportsEventManager.API.api_sporting_events.models.Atleta;

public record DetalhamentoAtletaDTO(Long id, String nome, Integer idade, String modalidade, Integer ranking) {
    public DetalhamentoAtletaDTO (Atleta atleta){
        this(atleta.getId(),atleta.getNome(),atleta.getIdade(),atleta.getModalidade(),atleta.getRanking());
    }
}
