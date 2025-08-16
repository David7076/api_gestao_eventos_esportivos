package SportsEventManager.API.api_sporting_events.services;

import SportsEventManager.API.api_sporting_events.dtos.AtletaCadastroDTO;
import SportsEventManager.API.api_sporting_events.dtos.DetalhamentoAtletaDTO;
import SportsEventManager.API.api_sporting_events.models.Atleta;
import SportsEventManager.API.api_sporting_events.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class AtletaService {

    @Autowired
    private AtletaRepository atletaRepository;

    public Atleta cadastrar(AtletaCadastroDTO atletaCadastroDTO) {
        var atleta = new Atleta(atletaCadastroDTO);
        atletaRepository.save(atleta);
        return atleta;
    }

}
