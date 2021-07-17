package com.newProyect10.demo.domain.repository;

import com.newProyect10.demo.domain.NotePad;


import java.util.List;


public interface NoteRepository {
   List<NotePad>getAll();
   NotePad save(NotePad notePad);
}
