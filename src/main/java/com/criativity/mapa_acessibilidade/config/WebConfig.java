package com.criativity.mapa_acessibilidade.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${cors.frontend.origin}")
    private String frontendOrigin;

    @PostConstruct
    public void logCorsOrigin() {
        System.out.println("CORS origin configurado como: " + frontendOrigin);
    }


    @Bean
    public CorsConfigurationSource corsConfigurationSource(@Value("${cors.frontend.origin}") String origin) {
        System.out.println("Entrou na configuração");
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(List.of(origin));
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        config.setAllowedHeaders(List.of("*"));
        config.setAllowCredentials(true);

        System.out.println("configurou");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        System.out.println("terminou a conf");
        return source;
    }

}
