package com.alura.one.forumhub.domain.topico;

import com.alura.one.forumhub.domain.enums.Curso;
import com.alura.one.forumhub.domain.enums.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTopico(
    @NotBlank
    String titulo,
    @NotBlank
    String mensagem,
    @NotNull
    Status status,
    @NotBlank
    String autor,
    @NotNull
    Curso curso) {
}
