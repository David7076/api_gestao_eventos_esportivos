package SportsEventManager.API.api_sporting_events.controller;

import SportsEventManager.API.api_sporting_events.dto.RequestAthleteDTO;
import SportsEventManager.API.api_sporting_events.dto.RequestUpdateAthleteDTO;
import SportsEventManager.API.api_sporting_events.dto.ResponseAthleteDTO;
import SportsEventManager.API.api_sporting_events.service.AthleteService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/athlete")
public class AthleteController {

    AthleteService service;

    public AthleteController(AthleteService service) {
        this.service = service;
    }

    @PostMapping("/createAthlete")
    @Transactional
    public ResponseEntity createAthlete(@RequestBody @Valid RequestAthleteDTO dto, UriComponentsBuilder uriBuilder) {
        var response = service.saveAthlete(dto);
        var uri = uriBuilder.path("/athlete/{id}").buildAndExpand(response.id()).toUri();
        return ResponseEntity.created(uri).body(response);
    }

    @GetMapping("/getAll")
    public ResponseEntity<Page<ResponseAthleteDTO>> getAllAthlete(@PageableDefault Pageable paginacao) {
        var page = service.listAllAthlete(paginacao);
        return ResponseEntity.ok(page);
    }


    @PutMapping("/updateAthlete")
    @Transactional
    public ResponseEntity<ResponseAthleteDTO> updateAthlete(@RequestBody @Valid RequestUpdateAthleteDTO dto) {
        ResponseAthleteDTO response = service.update(dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAthlete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
