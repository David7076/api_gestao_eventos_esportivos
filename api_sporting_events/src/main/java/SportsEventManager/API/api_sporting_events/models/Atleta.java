package SportsEventManager.API.api_sporting_events.models;


import SportsEventManager.API.api_sporting_events.dtos.AtletaCadastroDTO;
import lombok.Data;

@Data
public class Atleta {
    private Long id;
    private String nome;
    private Integer idade;
    private String modalidade;
    private Integer ranking;

    public Atleta(AtletaCadastroDTO dto) {
        this.nome = dto.nome();
        this.idade = dto.idade();
        this.modalidade = dto.modalidade();
        this.ranking = dto.ranking();
    }
}
