package one.digitalinnovation.springmvcrestjaxrs.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import one.digitalinnovation.springmvcrestjaxrs.controller.request.SoldadoUpdateRequest;
import one.digitalinnovation.springmvcrestjaxrs.controller.response.SoldadoListResponse;
import one.digitalinnovation.springmvcrestjaxrs.controller.response.SoldadoResponse;
import one.digitalinnovation.springmvcrestjaxrs.dto.Soldado;
import one.digitalinnovation.springmvcrestjaxrs.service.SoldadoService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private SoldadoService soldadoService;
    private ObjectMapper objectMapper;

    public SoldadoController (SoldadoService soldadoService, ObjectMapper objectMapper){
        this.soldadoService = soldadoService;
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public ResponseEntity<CollectionModel<SoldadoListResponse>> findAll(){
        CollectionModel<SoldadoListResponse> soldadoListResponses = soldadoService.findAll();
        return ResponseEntity.ok(soldadoListResponses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SoldadoResponse> findSoldado(@PathVariable Long id){
        SoldadoResponse soldadoResponse = soldadoService.findSoldado(id);
        return ResponseEntity.ok(soldadoResponse);
    }

    @PostMapping
    public ResponseEntity createSoldado(@RequestBody Soldado soldado){
        soldadoService.createSoldado(soldado);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity updateSoldado(@PathVariable Long id, @RequestBody SoldadoUpdateRequest soldadoUpdateRequest){
        soldadoService.updateSoldado(id, soldadoUpdateRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteSoldado(@PathVariable Long id){
        soldadoService.deleteSoldado(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/combat/{id}")
    public ResponseEntity combatSoldado(@PathVariable Long id){
        //Fazer algo
        return ResponseEntity.ok().build();
    }
}
