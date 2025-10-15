package SportsEventManager.API.api_sporting_events.controllers;

import SportsEventManager.API.api_sporting_events.dtos.AtletaCadastroDTO;
import SportsEventManager.API.api_sporting_events.dtos.AtletaListagemDTO;
import SportsEventManager.API.api_sporting_events.dtos.DetalhamentoAtletaDTO;
import SportsEventManager.API.api_sporting_events.services.AtletaService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/atletas")
public class AtletasController {

    AtletaService service;

    public AtletasController(AtletaService service) {
        this.service = service;
    }

    @PostMapping("/cadastrarAtleta")
    @Transactional
    public ResponseEntity cadastrarAtleta(@RequestBody @Valid AtletaCadastroDTO atletaDTO, UriComponentsBuilder uriBuilder) {
        var atleta = service.cadastrar(atletaDTO);
        var uri = uriBuilder.path("/atleta/{id}").buildAndExpand(atleta.getId()).toUri();
        return ResponseEntity.created(uri).body(new DetalhamentoAtletaDTO(atleta));
    }

    @GetMapping("/buscarAtletas")
    public ResponseEntity<Page<AtletaListagemDTO>> listarAtletas(@PageableDefault Pageable paginacao) {

        return null;
    }

}
