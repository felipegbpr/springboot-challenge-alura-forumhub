package com.alura.one.forumhub.domain.topico;

import com.alura.one.forumhub.domain.enums.Curso;
import com.alura.one.forumhub.domain.enums.Status;

import java.time.LocalDateTime;

public record DadosListagemTopico(

        Long id,
        String titulo,
        String mensagem,
        LocalDateTime data_criacao,
        Status status,
        String autor,
        Curso curso) {

    public DadosListagemTopico(Topico topico) {
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