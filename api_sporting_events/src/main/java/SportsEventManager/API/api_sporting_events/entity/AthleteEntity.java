package SportsEventManager.API.api_sporting_events.entity;



import SportsEventManager.API.api_sporting_events.enums.Modality;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Athlete")
@Table(name = "tb_athlete")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = "id")
public class AthleteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_athlete")
    private Long id;


    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Modality modality;

    @Column(name = "ranking")
    private Integer ranking;

}
