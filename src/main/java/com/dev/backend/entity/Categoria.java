package com.dev.backend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    @Temporal(TemporalType.TIMESTAMP)
    private Data dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Data dataAtualizacao;

}
