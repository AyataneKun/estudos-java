package one.digitalinnovation.springwebmvc.rest;

import one.digitalinnovation.springwebmvc.exception.JediNotFoundException;
import one.digitalinnovation.springwebmvc.model.Jedi;
import one.digitalinnovation.springwebmvc.repository.JediRepository;
import one.digitalinnovation.springwebmvc.service.JediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@RestController
public class JediResource {

    @Autowired
    private JediService service;

    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi(){
        return service.findAll();
    }

    @GetMapping("/api/jedi/{id}")
    public ResponseEntity<Jedi> getJedi(@PathVariable("id") Long id){

        Jedi jedi = service.findById(id);
        return ResponseEntity.ok(jedi);
    }

    @PostMapping("/api/jedi/")
    @ResponseStatus(HttpStatus.CREATED)
    public Jedi createJedi(@Valid @RequestBody Jedi jedi){

        return service.save(jedi);
    }

    @PutMapping("api/jedi/{id}")
    public ResponseEntity<Jedi> updateJedi(@Valid @RequestBody Jedi dto, @PathVariable("id") Long id){

        Jedi jedi = service.update(id, dto);
        return ResponseEntity.ok(jedi);
    }

    @DeleteMapping("api/jedi/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteJedi(@PathVariable("id") Long id){

        service.delete(id);
    }
}
