package com.alura.one.forumhub.domain.topico;

import com.alura.one.forumhub.domain.enums.Curso;
import com.alura.one.forumhub.domain.enums.Status;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
        @NotNull
        Long id,
        String titulo,
        String mensagem,
        Status status,
        Curso curso) {
}
