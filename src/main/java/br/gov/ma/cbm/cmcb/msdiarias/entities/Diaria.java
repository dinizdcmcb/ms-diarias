package br.gov.ma.cbm.cmcb.msdiarias.entities;

import java.io.Serializable;

public class Diaria implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private Double diaServico;
    private Integer diasTrabalhados;

    public Diaria() {
    }

    public Diaria(String nome, Double diaServico, Integer diasTrabalhados) {
        this.nome = nome;
        this.diaServico = diaServico;
        this.diasTrabalhados = diasTrabalhados;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Double return the horaServico
     */
    public Double getDiaServico() {
        return diaServico;
    }

    /**
     * @param diaServico the diaServico to set
     */
    public void setDiaServico(Double diaServico) {
        this.diaServico = diaServico;
    }

    /**
     * @return Integer return the diasTrabalhados
     */
    public Integer getDiasTrabalhados() {
        return diasTrabalhados;
    }

    /**
     * @param diasTrabalhados the diasTrabalhados to set
     */
    public void setDiasTrabalhados(Integer diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getTotal() {
        return diasTrabalhados * diaServico;
    }

}
