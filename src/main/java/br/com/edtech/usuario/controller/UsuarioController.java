package br.com.edtech.usuario.controller;

import br.com.edtech.usuario.model.Usuario;
import br.com.edtech.usuario.model.UsuarioDTO;
import br.com.edtech.usuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody UsuarioDTO data){
        return new ResponseEntity<>(service.criarUsuario(data), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable UUID id){
        return new ResponseEntity<>(service.buscarPorId(id), HttpStatus.OK);
    }
}
