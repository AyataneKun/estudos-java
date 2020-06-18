package one.digitalinnovation.springwebmvc.service;

import one.digitalinnovation.springwebmvc.exception.JediNotFoundException;
import one.digitalinnovation.springwebmvc.model.Jedi;
import one.digitalinnovation.springwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JediService {

    @Autowired
    private JediRepository repository;

    public List<Jedi> findAll() {
        return repository.findAll();
    }

    public Jedi findById(Long id) {
        Optional<Jedi> jedi = repository.findById(id);

        if(jedi.isPresent()) {
            return jedi.get();
        }else{
            throw new JediNotFoundException();
        }
    }

    public Jedi save(Jedi jedi) {
        return repository.save(jedi);
    }

    public Jedi update(Long id, Jedi dto) {

        Optional<Jedi> jediEntity = repository.findById(id);
        final Jedi jedi;

        if(jediEntity.isPresent()){
            jedi = jediEntity.get();
        }else {
            throw new JediNotFoundException();
        }
        jedi.setName(dto.getName());
        jedi.setLastName(dto.getLastName());

        return repository.save(jedi);
    }

    public void delete(Long id) {

        Jedi jedi = findById(id);

        repository.delete(jedi);
    }
}
