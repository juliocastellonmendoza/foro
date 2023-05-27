package com.project.foro.domain.topicos;

import jakarta.validation.constraints.NotBlank;

public record DatosListadoTopicos(
        Long id,
        String titulo,
        String mensaje,
        String fecha_creacion,
        String estatus,
        String autor,
        String curso
) {

    public DatosListadoTopicos(Topicos topicos){
        this(topicos.getId(), topicos.getTitulo(), topicos.getMensaje(), topicos.getFecha_creacion(), topicos.getEstatus(), topicos.getAutor(), topicos.getCurso());
    }
}
