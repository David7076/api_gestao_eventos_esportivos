package SportsEventManager.API.api_sporting_events.entities;


import SportsEventManager.API.api_sporting_events.models.Atleta;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Atleta")
@Table(name = "tbatleta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = "id")
public class AtletaEntity {
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

    public AtletaEntity(Atleta atletaDTO) {
        this.nome = atletaDTO.getNome();
        this.idade = atletaDTO.getIdade();
        this.modalidade = atletaDTO.getModalidade();
        this.ranking = atletaDTO.getRanking();
    }
}
