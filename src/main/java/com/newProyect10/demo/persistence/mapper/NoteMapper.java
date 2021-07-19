package com.newProyect10.demo.persistence.mapper;

import com.newProyect10.demo.domain.NotePad;
import com.newProyect10.demo.persistence.entity.BlocDeNotas;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NoteMapper {
    @Mappings({
            @Mapping(source = "idnota", target = "noteId"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "nota", target = "note"),
            @Mapping(source = "fecha", target = "datenote"),

    })
    NotePad toNotePad(BlocDeNotas blocDeNotas);
    List<NotePad>toNotePads(List<NotePad>notePads);

    @InheritInverseConfiguration
     BlocDeNotas toBlocDeNotas(NotePad notePad);

}
