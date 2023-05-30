package com.project.foro.domain.topicos;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Topicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fecha_creacion;
    private String estatus;
    private String autor;
    private String curso;

    public Topicos(DatosRegistroTopicos datosRegistroTopicos) {
        this.titulo= datosRegistroTopicos.titulo();
        this.mensaje = datosRegistroTopicos.mensaje();
        this.fecha_creacion = datosRegistroTopicos.fecha_creacion();
        this.estatus = datosRegistroTopicos.estatus();
        this.autor = datosRegistroTopicos.autor();
        this.curso = datosRegistroTopicos.curso();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {

        if(datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if(datosActualizarTopico.fecha_creacion() != null){
            this.fecha_creacion = datosActualizarTopico.fecha_creacion();
        }
        if(datosActualizarTopico.estatus() != null){
            this.estatus = datosActualizarTopico.estatus();
        }
        if(datosActualizarTopico.autor() != null){
            this.autor = datosActualizarTopico.autor();
        }
        if(datosActualizarTopico.curso() != null){
            this.curso = datosActualizarTopico.curso();
<<<<<<< HEAD
        
=======

>>>>>>> julio
        }
    }
}
