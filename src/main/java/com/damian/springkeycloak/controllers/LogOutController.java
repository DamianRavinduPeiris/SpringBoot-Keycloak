package com.damian.springkeycloak.controllers;


import com.damian.springkeycloak.config.KeycloakLogoutHandler;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogOutController {

    private final KeycloakLogoutHandler keycloakLogoutHandler;

    public LogOutController(KeycloakLogoutHandler keycloakLogoutHandler) {
        this.keycloakLogoutHandler = keycloakLogoutHandler;
    }

    @GetMapping("/logout")
    public void logout() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        keycloakLogoutHandler.logout(null, null, authentication);
    }
}