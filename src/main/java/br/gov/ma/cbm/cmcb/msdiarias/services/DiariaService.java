package br.gov.ma.cbm.cmcb.msdiarias.services;

import org.springframework.stereotype.Service;

import br.gov.ma.cbm.cmcb.msdiarias.entities.Diaria;

@Service
public class DiariaService {
    public Diaria getDiaria(long funcionarioId, int dias) {
        return new Diaria("Diniz", 350.0, dias);
    }
}
