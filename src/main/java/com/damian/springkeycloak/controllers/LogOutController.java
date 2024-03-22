package com.damian.springkeycloak.controllers;


import com.damian.springkeycloak.config.KeycloakLogoutHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogOutController {
    private final KeycloakLogoutHandler keycloakLogoutHandler;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;

    public LogOutController(KeycloakLogoutHandler keycloakLogoutHandler) {
        this.keycloakLogoutHandler = keycloakLogoutHandler;
    }

    @GetMapping("/logout")
    public void logout() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        keycloakLogoutHandler.logout(request, response, authentication);
    }
}