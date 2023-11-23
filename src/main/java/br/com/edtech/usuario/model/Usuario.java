package br.com.edtech.usuario.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "usuarios")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String primeiroNome;

    private String sobrenome;

    private Integer idade;

    @Column(unique = true)
    private String email;

    @NotBlank
    private String senha;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

    private LocalDateTime dataRegistro;

    public Usuario(UsuarioDTO data) {
        this.primeiroNome = data.primeiroNome();
        this.sobrenome = data.sobrenome();
        this.idade = data.idade();
        this.email = data.email();
        this.senha = data.senha();
        this.tipoUsuario = data.tipoUsuario();
        this.dataRegistro = LocalDateTime.now();
    }
}
