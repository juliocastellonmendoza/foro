package com.project.foro.domain.topicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,
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
