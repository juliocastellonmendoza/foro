package com.project.foro.domain.Usuarios;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Usuarios")
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String clave;
}
