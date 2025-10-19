package SportsEventManager.API.api_sporting_events.repository;

import SportsEventManager.API.api_sporting_events.entity.AthleteEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteRepository extends JpaRepository<AthleteEntity, Long> {
//    Page<AthleteEntity> findAll(Pageable paginacao);
}
