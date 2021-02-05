package br.gov.ma.cbm.cmcb.msdiarias.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configs {

    // SINGLETON
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}