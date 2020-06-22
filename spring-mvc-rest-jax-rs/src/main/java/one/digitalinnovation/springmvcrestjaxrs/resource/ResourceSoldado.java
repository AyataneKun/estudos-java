package one.digitalinnovation.springmvcrestjaxrs.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import one.digitalinnovation.springmvcrestjaxrs.controller.SoldadoController;
import one.digitalinnovation.springmvcrestjaxrs.controller.response.SoldadoListResponse;
import one.digitalinnovation.springmvcrestjaxrs.controller.response.SoldadoResponse;
import one.digitalinnovation.springmvcrestjaxrs.entity.SoldadoEntity;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ResourceSoldado {
    private ObjectMapper objectMapper;

    public ResourceSoldado(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }

    public SoldadoListResponse createLink(SoldadoEntity soldadoEntity){
        SoldadoListResponse soldadoListResponse = objectMapper.convertValue(soldadoEntity, SoldadoListResponse.class);
        Link link = linkTo(methodOn(SoldadoController.class).findSoldado(soldadoEntity.getId())).withSelfRel();
        soldadoListResponse.add(link);
        return soldadoListResponse;
    }

    public SoldadoResponse createDetailLink(SoldadoEntity soldadoEntity){
        SoldadoResponse soldadoListResponse = objectMapper.convertValue(soldadoEntity, SoldadoResponse.class);
        if(soldadoEntity.getStatus().toLowerCase().equals("morto")){
            Link link = linkTo(methodOn(SoldadoController.class).deleteSoldado(soldadoEntity.getId())).withRel("remove")
                    .withTitle("Deletar Soldado")
                    .withType("delete");
            soldadoListResponse.add(link);
        }else if(soldadoEntity.getStatus().toLowerCase().equals("vivo")){
            Link link = linkTo(methodOn(SoldadoController.class).combatSoldado(soldadoEntity.getId())).withRel("combat")
                    .withTitle("Ir ao Combate")
                    .withType("put");
            soldadoListResponse.add(link);
        }

        return soldadoListResponse;
    }
}
