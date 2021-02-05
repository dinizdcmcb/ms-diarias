package br.gov.ma.cbm.cmcb.msdiarias.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ma.cbm.cmcb.msdiarias.entities.Diaria;
import br.gov.ma.cbm.cmcb.msdiarias.services.DiariaService;

@RestController
@RequestMapping(value = "/diarias")
public class DiariaResource {

    @Autowired
    private DiariaService diariaService;

    @GetMapping(value = "/{funcionarioId}/dias/{dias}")
    public ResponseEntity<Diaria> getDiaria(@PathVariable Long funcionarioId, @PathVariable Integer dias) {
        Diaria diaria = diariaService.getDiaria(funcionarioId, dias);
        return ResponseEntity.ok(diaria);
    }

}
