package com.newProyect10.demo.web.controller;


import com.newProyect10.demo.domain.NotePad;
import com.newProyect10.demo.domain.service.NotePadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/notes")
public class NotePadController {
    @Autowired
    private NotePadService notePadService;

    @GetMapping("all")
    public ResponseEntity<List<NotePad>> getAll() {
        return new ResponseEntity<>(notePadService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<NotePad> save(@RequestBody NotePad notePad) {
        return new ResponseEntity(notePadService.save(notePad), HttpStatus.CREATED);
    }

}
