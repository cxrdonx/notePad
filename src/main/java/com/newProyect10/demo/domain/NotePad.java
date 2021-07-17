package com.newProyect10.demo.domain;

import java.text.DateFormat;

public class NotePad {
    private int notepad;
    private String nota;
    private DateFormat datenote;

    public int getNotepad() {
        return notepad;
    }

    public void setNotepad(int notepad) {
        this.notepad = notepad;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public DateFormat getDatenote() {
        return datenote;
    }

    public void setDatenote(DateFormat datenote) {
        this.datenote = datenote;
    }
}
