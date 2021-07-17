package com.newProyect10.demo.persistence.crud;

import com.newProyect10.demo.persistence.entity.BlocDeNotas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BlocCrudRepository extends CrudRepository<BlocDeNotas, Integer> {
    Optional<List<BlocDeNotas>>findByidNota(String idnota);
}
