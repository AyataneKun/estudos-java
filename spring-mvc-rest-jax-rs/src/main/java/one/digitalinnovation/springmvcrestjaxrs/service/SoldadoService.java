package one.digitalinnovation.springmvcrestjaxrs.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import one.digitalinnovation.springmvcrestjaxrs.controller.request.SoldadoUpdateRequest;
import one.digitalinnovation.springmvcrestjaxrs.controller.response.SoldadoListResponse;
import one.digitalinnovation.springmvcrestjaxrs.controller.response.SoldadoResponse;
import one.digitalinnovation.springmvcrestjaxrs.dto.Soldado;
import one.digitalinnovation.springmvcrestjaxrs.entity.SoldadoEntity;
import one.digitalinnovation.springmvcrestjaxrs.repository.SoldadoRepository;
import one.digitalinnovation.springmvcrestjaxrs.resource.ResourceSoldado;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SoldadoService {

    private SoldadoRepository soldadoRepository;
    private ObjectMapper objectMapper;
    private ResourceSoldado resourceSoldado;

    public SoldadoService(SoldadoRepository soldadoRepository, ObjectMapper objectMapper, ResourceSoldado resourceSoldado){
        this.soldadoRepository = soldadoRepository;
        this.objectMapper = objectMapper;
        this.resourceSoldado = resourceSoldado;
    }

    public SoldadoResponse findSoldado(Long id){
        SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow();
        SoldadoResponse detailLink = resourceSoldado.createDetailLink(soldado);
        return detailLink;
    }

    public void createSoldado(Soldado soldado){
        SoldadoEntity soldadoEntity = objectMapper.convertValue(soldado, SoldadoEntity.class);
        soldadoRepository.save(soldadoEntity);
    }

    public void updateSoldado(Long id, SoldadoUpdateRequest soldadoUpdateRequest) {
        SoldadoEntity soldadoEntity = objectMapper.convertValue(soldadoUpdateRequest, SoldadoEntity.class);
        soldadoEntity.setId(id);
        soldadoRepository.save(soldadoEntity);
    }

    public void deleteSoldado(Long id) {
        SoldadoEntity soldadoEntity = soldadoRepository.findById(id).orElseThrow();
        soldadoRepository.delete(soldadoEntity);
    }

    public CollectionModel<SoldadoListResponse> findAll() {
        List<SoldadoEntity> all = soldadoRepository.findAll();
        List<SoldadoListResponse> soldadoStream = all.stream()
                .map(it -> resourceSoldado.createLink(it))
                .collect(Collectors.toList());
        return new CollectionModel<>(soldadoStream);
    }
}
