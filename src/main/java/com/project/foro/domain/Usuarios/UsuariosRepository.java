package com.project.foro.domain.Usuarios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

//Se crea despues de AutenticationService

public interface UsuariosRepository extends JpaRepository<Usuarios,Long> {

    UserDetails findByLogin(String username);
}
