package com.newProyect10.demo.persistence.entity;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "notes")
public class BlocDeNotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnote")
    private Integer idnota;

    @Column(name = "note")
     private String nota;

    @Column(name = "datenote")
     private DateFormat fecha;

    public Integer getIdnota() {
        return idnota;
    }

    public void setIdnota(Integer idnota) {
        this.idnota = idnota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public DateFormat getFecha() {
        return fecha;
    }

    public void setFecha(DateFormat fecha) {
        this.fecha = fecha;
    }
}
