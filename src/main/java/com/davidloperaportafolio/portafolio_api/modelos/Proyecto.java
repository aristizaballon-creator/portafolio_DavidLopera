package com.davidloperaportafolio.portafolio_api.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.util.List;

@Data
@Document(collection = "proyectos") // Le dice a Spring que esto es una colección en MongoDB
public class Proyecto {
    
    @Id
    private String id; // Este será tu "slug" (ej: "kn-agency")
    
    private String titulo;
    private String descripcion;
    private List<Video> videos;
}