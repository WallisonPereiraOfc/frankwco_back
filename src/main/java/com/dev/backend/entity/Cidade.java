package com.dev.backend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
@Data
public class Cidade extends Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "idestado")
    private String estado;
    private String nome;
    @Temporal(TemporalType.TIMESTAMP)
    private Data dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Data dataAtualizacao;


}
