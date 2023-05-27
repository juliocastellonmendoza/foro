package com.project.foro.domain.topicos;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopicos(

        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fecha_creacion,
        @NotBlank
        String estatus,
        @NotBlank
        String autor,
        @NotBlank
        String curso


) {

}
