package SportsEventManager.API.api_sporting_events.models;

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
    private Long id;

    private String nome;
    private Integer idade;
    private String modalidade;

    private Integer ranking;
}
