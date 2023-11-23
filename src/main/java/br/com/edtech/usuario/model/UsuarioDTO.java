package br.com.edtech.usuario.model;

public record UsuarioDTO(String primeiroNome,
                         String sobrenome,
                         Integer idade,
                         String email,
                         String senha,
                         TipoUsuario tipoUsuario) {
}
