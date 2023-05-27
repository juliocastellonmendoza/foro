package com.project.foro.controller;

import com.project.foro.domain.topicos.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<DatosRespuestaTopico> registrarTopicos(@RequestBody @Valid DatosRegistroTopicos datosRegistroTopicos,
                                                                 UriComponentsBuilder uriComponentsBuilder){

        Topicos topicos = topicoRepository.save(new Topicos(datosRegistroTopicos));
        DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(topicos.getId(),topicos.getTitulo(),topicos.getMensaje(),topicos.getFecha_creacion(),
                topicos.getEstatus(),topicos.getAutor(),topicos.getCurso());
        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topicos.getId()).toUri();
        return ResponseEntity.created(url).body(datosRespuestaTopico);
    }

    @GetMapping
    public ResponseEntity<Page<DatosListadoTopicos>> listadoTopicos(@PageableDefault(size = 10) Pageable  paginacion){
        return ResponseEntity.ok(topicoRepository.findAll(paginacion).map(DatosListadoTopicos::new));
        //return topicoRepository.findByEstatusActivado(paginacion).map(DatosListadoTopicos::new);
    }

    @PutMapping
    @Transactional
    public ResponseEntity actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico){
        Topicos topicos = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topicos.actualizarDatos(datosActualizarTopico);
        return ResponseEntity.ok(new DatosRespuestaTopico(topicos.getId(),topicos.getTitulo(),topicos.getMensaje(),topicos.getFecha_creacion(),
                topicos.getEstatus(),topicos.getAutor(),topicos.getCurso()));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarTopico(@PathVariable Long id){
        Topicos topicos = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topicos);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaTopico> RetornarDatosTopico(@PathVariable Long id){
        Topicos topicos = topicoRepository.getReferenceById(id);
        var datosTopico = new DatosRespuestaTopico(topicos.getId(),topicos.getTitulo(),topicos.getMensaje(),
                topicos.getFecha_creacion(),topicos.getEstatus(),topicos.getAutor(),topicos.getCurso());
        return ResponseEntity.ok(datosTopico);
    }


}
