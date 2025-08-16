package SportsEventManager.API.api_sporting_events.repository;

import SportsEventManager.API.api_sporting_events.models.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtletaRepository extends JpaRepository<Atleta, Long> {
}
