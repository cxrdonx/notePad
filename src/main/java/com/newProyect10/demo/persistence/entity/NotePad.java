package com.newProyect10.demo.persistence.entity;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "notes")
public class NotePad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnote")
    private Integer idnote;
     private String note;
     private DateFormat datenote;

    public Integer getIdnote() {
        return idnote;
    }

    public void setIdnote(Integer idnote) {
        this.idnote = idnote;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public DateFormat getDatenote() {
        return datenote;
    }

    public void setDatenote(DateFormat datenote) {
        this.datenote = datenote;
    }
}
