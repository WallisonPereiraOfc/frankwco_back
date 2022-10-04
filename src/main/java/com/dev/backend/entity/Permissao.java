package com.dev.backend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
public class Permissao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    @Temporal(TemporalType.TIMESTAMP)
    private Data dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Data dataAtulizacao;
}
