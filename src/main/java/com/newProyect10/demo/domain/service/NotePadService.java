package com.newProyect10.demo.domain.service;

import com.newProyect10.demo.domain.NotePad;
import com.newProyect10.demo.domain.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotePadService {


    @Autowired
     private NoteRepository noteRepository;

     public List<NotePad> getAll(){
          return noteRepository.getAll();
     }

     public List<NotePad> save(NotePad notePad){
         return noteRepository.save(notePad);
     }

}
