package SportsEventManager.API.api_sporting_events.services;

import SportsEventManager.API.api_sporting_events.dtos.AtletaCadastroDTO;
import SportsEventManager.API.api_sporting_events.entities.AtletaEntity;
import SportsEventManager.API.api_sporting_events.models.Atleta;
import SportsEventManager.API.api_sporting_events.repository.AtletaRepository;
import org.springframework.stereotype.Service;


@Service
public class AtletaService {

    private AtletaRepository respository;

    public AtletaService(AtletaRepository repository) {
        this.respository = repository;
    }

    public Atleta cadastrar(AtletaCadastroDTO atletaCadastroDTO) {
        var atleta = new Atleta(atletaCadastroDTO);
        AtletaEntity atletaEntity = new AtletaEntity(atleta);
        return atleta;
    }

}
