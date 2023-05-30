package com.project.foro.infra.security;

import com.project.foro.domain.Usuarios.UsuariosRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class SecurityFilter extends OncePerRequestFilter {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UsuariosRepository usuariosRepository;


    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain filterChain) throws ServletException, IOException {

        var authHeader = req.getHeader("Authorization");
        System.out.println(authHeader);
        if(authHeader != null){

            var token = authHeader.replace("Bearer ", "");
            var subject = tokenService.getSubject(token);
            if(subject != null){
                //El Token es valido
                var usuario = usuariosRepository.findByLogin(subject);
                var authentication = new UsernamePasswordAuthenticationToken(usuario,null,
                        usuario.getAuthorities()); //forzamos un inicio de seción
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }
        filterChain.doFilter(req,res);
    }
}
