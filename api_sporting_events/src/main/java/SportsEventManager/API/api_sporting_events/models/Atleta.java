package SportsEventManager.API.api_sporting_events.models;

import SportsEventManager.API.api_sporting_events.dtos.AtletaCadastroDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Atleta")
@Table(name = "tbAtleta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = "id")
public class Atleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atleta")
    private Long id;


    @Column(nullable = false, length = 30)
    private String nome;

    @Column(nullable = false)
    private Integer idade;

    @Column(nullable = false)
    private String modalidade;

    private Integer ranking;

    public Atleta(AtletaCadastroDTO atletaDTO) {
        this.nome = atletaDTO.nome();
        this.idade = atletaDTO.idade();
        this.modalidade = atletaDTO.modalidade();
        this.ranking = atletaDTO.ranking();
    }
}
