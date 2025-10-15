package SportsEventManager.API.api_sporting_events.repository;

import SportsEventManager.API.api_sporting_events.entities.AtletaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtletaRepository extends JpaRepository<AtletaEntity, Long> {
    Page<AtletaEntity> findAllByAtivoTrue(Pageable paginacao);
}
