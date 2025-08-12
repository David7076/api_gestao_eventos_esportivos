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
    @Column(name = "id_atleta")
    private Long id;


    @Column(nullable = false, length = 30)
    private String nome;

    @Column(nullable = false)
    private Integer idade;

    private String modalidade;

    private Integer ranking;
}
