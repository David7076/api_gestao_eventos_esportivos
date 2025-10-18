package SportsEventManager.API.api_sporting_events.service;

import SportsEventManager.API.api_sporting_events.dto.RequestAthleteDTO;
import SportsEventManager.API.api_sporting_events.dto.ResponseAthleteDTO;
import SportsEventManager.API.api_sporting_events.entity.AthleteEntity;
import SportsEventManager.API.api_sporting_events.mapper.AthleteMapper;
import SportsEventManager.API.api_sporting_events.repository.AthleteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class AthleteService {

    private AthleteRepository repository;

    public AthleteService(AthleteRepository repository) {
        this.repository = repository;
    }

    public ResponseAthleteDTO saveAthlete(RequestAthleteDTO dto) {
//        var atleta = new Atleta(atletaCadastroDTO);
//        AthleteEntity atletaEntity = new AthleteEntity(atleta);
//        repository.save(atletaEntity);
//        return atleta;
        AthleteEntity entity = AthleteMapper.toEntity(dto);
        repository.save(entity);
        return AthleteMapper.toDTO(entity);

    }

    public Page<ResponseAthleteDTO> listAllAthlete(Pageable paginacao) {
        return repository.findAll(paginacao).map(ResponseAthleteDTO::new);
    }


}
