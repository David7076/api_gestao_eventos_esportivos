package SportsEventManager.API.api_sporting_events.controllers;

import SportsEventManager.API.api_sporting_events.dtos.AtletaCadastroDTO;
import SportsEventManager.API.api_sporting_events.dtos.DetalhamentoAtletaDTO;
import SportsEventManager.API.api_sporting_events.models.Atleta;
import SportsEventManager.API.api_sporting_events.services.AtletaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/atletas")
public class AtletasController {

    @Autowired
    private AtletaService atletaService;


    @PostMapping
    @Transactional
    public ResponseEntity cadastrarAtleta(@RequestBody @Valid AtletaCadastroDTO atletaDTO, UriComponentsBuilder uriBuilder) {
        var atleta = atletaService.cadastrar(atletaDTO);
        var uri = uriBuilder.path("/atleta/{id}").buildAndExpand(atleta.getId()).toUri();
        return ResponseEntity.created(uri).body(new DetalhamentoAtletaDTO(atleta));
    }

}
