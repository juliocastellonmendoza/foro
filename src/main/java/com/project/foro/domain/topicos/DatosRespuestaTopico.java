package com.project.foro.domain.topicos;

public record DatosRespuestaTopico( Long id, String titulo, String mensaje, String fecha_creacion,
                                    String estatus, String autor, String curso) {
}
