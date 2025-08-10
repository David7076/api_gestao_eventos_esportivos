package SportsEventManager.API.api_sporting_events.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

@Entity(name = "Evento")
@Table(name = "tbEvento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento", nullable = false)
    private Long id;

    @Column(nullable = false, length = 30)
    private String nome;

    //Alterar para um enum
    @Column(nullable = false)
    private String modalidade;


    private LocalDateTime data;

    private String local;

    private Integer vagasDisponiveis;


}
