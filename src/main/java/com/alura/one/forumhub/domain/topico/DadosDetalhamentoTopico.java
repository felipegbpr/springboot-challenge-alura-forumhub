package com.alura.one.forumhub.domain.topico;

import com.alura.one.forumhub.domain.enums.Curso;
import com.alura.one.forumhub.domain.enums.Status;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        Status status,
        String autor,
        Curso curso) {

    public DadosDetalhamentoTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
