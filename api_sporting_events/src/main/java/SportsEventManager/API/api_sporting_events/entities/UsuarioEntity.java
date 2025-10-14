package SportsEventManager.API.api_sporting_events.entities;


import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity(name = "Usuario")
@Table(name = "tbUsuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = "id")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;


    @NotNull
    @Column(name = "email", nullable = false, length = 30)
    private String email;

    @NotNull
    @Column(name = "password", nullable = false, length = 100)
    private String senha;
}
