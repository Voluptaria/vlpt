package com.voluptaria.vlpt.service;

import com.voluptaria.vlpt.model.Pacote;
import com.voluptaria.vlpt.model.Pacote;
import com.voluptaria.vlpt.repository.PacoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PacoteService {

    private final PacoteRepository repository;

    public List<Pacote> getPacotes() {
        return repository.findAll();
    }

    public Optional<Pacote> getPacoteById(Long id){
       return repository.findById(id);
    }

    @Transactional
    public Pacote save(Pacote pacote) {
        validar(pacote);
        return repository.save(pacote);
    }

    private void validar(Pacote pacote) {
    }
}
