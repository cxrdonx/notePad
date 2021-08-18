package com.project.NotePad.domain.repository;

import com.project.NotePad.domain.NotePad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


public interface NoteRepository {
   List<NotePad>getAll();
   NotePad save(NotePad notePad);
   Optional<List<NotePad>> getByTitle(String title);
}
