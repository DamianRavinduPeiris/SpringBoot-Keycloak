package com.damian.springkeycloak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    @Bean
    public KeycloakLogoutHandler keycloakLogoutHandler() {
        return new KeycloakLogoutHandler(restTemplate());
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
