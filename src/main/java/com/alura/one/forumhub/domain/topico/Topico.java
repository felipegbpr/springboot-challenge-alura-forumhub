package com.alura.one.forumhub.domain.topico;

import com.alura.one.forumhub.domain.enums.Curso;
import com.alura.one.forumhub.domain.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "Topico")
@Table(name = "topicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Enumerated(EnumType.STRING)
    private Status status = Status.NAO_RESPONDIDO;
    private String autor;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    private Boolean ativo;

    public Topico(DadosCadastroTopico dados) {

        this.ativo = true;
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.dataCriacao = LocalDateTime.now();
        this.status = dados.status();
        this.autor = dados.autor();
        this.curso = dados.curso();
    }

    public void atualizarInformacoes(DadosAtualizacaoTopico dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }

        if (dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }

        if (dados.status() != null) {
            this.status = dados.status();
        }

        if (dados.curso() != null) {
            this.curso = dados.curso();
        }
    }

    public void excluir() {
        this.ativo = false;
    }


}
