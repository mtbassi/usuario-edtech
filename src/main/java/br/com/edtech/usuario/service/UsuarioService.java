package br.com.edtech.usuario.service;

import br.com.edtech.usuario.model.Usuario;
import br.com.edtech.usuario.model.UsuarioDTO;
import br.com.edtech.usuario.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class UsuarioService {

    private final UsuarioRepository repository;

    public Usuario criarUsuario(UsuarioDTO data){
        log.info("[" + getClass().getSimpleName() + "] Criando usuário");
        return repository.save(new Usuario(data));
    }

    public Usuario buscarPorId(UUID id){
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
    }
}
