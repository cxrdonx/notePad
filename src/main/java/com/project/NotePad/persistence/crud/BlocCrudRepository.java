package com.project.NotePad.persistence.crud;

import com.project.NotePad.domain.NotePad;
import com.project.NotePad.persistence.entity.BlocDeNotas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface BlocCrudRepository extends CrudRepository<BlocDeNotas, String> {
    // Optional<List<BlocDeNotas>> findByTitle(String titulo);
}
