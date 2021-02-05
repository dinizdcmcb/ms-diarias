package br.gov.ma.cbm.cmcb.msdiarias.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.gov.ma.cbm.cmcb.msdiarias.entities.Diaria;
import br.gov.ma.cbm.cmcb.msdiarias.entities.externas.Funcionario;

@Service
public class DiariaService {

    @Value("${ms-funcionarios.host}")
    private String funcionariosHost;

    @Autowired
    private RestTemplate restTemplate;

    public Diaria getDiaria(long funcionarioId, int dias) {

        Map<String, String> uriVariaveis = new HashMap<>();
        uriVariaveis.put("id", "" + funcionarioId);

        String url = funcionariosHost + "/funcionarios/{id}";

        Funcionario funcionario = restTemplate.getForObject(url, Funcionario.class, uriVariaveis);

        return new Diaria(funcionario.getNome(), funcionario.getHoraServico(), dias);
    }
}
