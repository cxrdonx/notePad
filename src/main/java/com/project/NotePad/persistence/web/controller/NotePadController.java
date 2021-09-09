package com.project.NotePad.persistence.web.controller;

import com.project.NotePad.domain.NotePad;
import com.project.NotePad.domain.service.NotePadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class NotePadController {
    @Autowired
    private NotePadService notePadService;

    @CrossOrigin(origins = "")
    @GetMapping("/all")
   public ResponseEntity<List<NotePad>> getAll(){
        return new ResponseEntity<>(notePadService.getAll(), HttpStatus.OK);
    }
    @CrossOrigin(origins = "")
    @PostMapping("/save")
    public ResponseEntity<NotePad> save(@RequestBody NotePad notepad){
        return new ResponseEntity<>(notePadService.save(notepad), HttpStatus.CREATED);
    }
   /*
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/title/{title}")
     public ResponseEntity<List<NotePad>> getByTitle(String title){
        return notePadService.getByTitle(title)
                .map(notePads -> new ResponseEntity<>(notePads, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    */
}
