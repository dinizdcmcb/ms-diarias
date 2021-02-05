package br.gov.ma.cbm.cmcb.msdiarias.entities.externas;

import java.io.Serializable;

public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private Double horaServico;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, Double horaServico) {
        this.id = id;
        this.nome = nome;
        this.horaServico = horaServico;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getHoraServico() {
        return this.horaServico;
    }

    public void setHoraServico(Double horaServico) {
        this.horaServico = horaServico;
    }

}
