package com.project.NotePad.domain.service;

import com.project.NotePad.domain.NotePad;
import com.project.NotePad.domain.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class NotePadService {

    @Autowired
    private NoteRepository noteRepository;

    public List<NotePad> getAll() {
        return noteRepository.getAll();
    }

    public NotePad save(NotePad notePad) {
        return noteRepository.save(notePad);
    }

    public Optional<List<NotePad>> getByTitle(String title){
        return noteRepository.getByTitle(title);

}
}
