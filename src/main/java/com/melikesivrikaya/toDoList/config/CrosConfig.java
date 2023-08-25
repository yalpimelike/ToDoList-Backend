package com.melikesivrikaya.toDoList.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CrosConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // İzin vermek istediğiniz kaynakları buraya ekleyin
        config.addAllowedOrigin("*"); // Tüm kaynaklara izin vermek için '*'

        // İzin vermek istediğiniz HTTP yöntemlerini buraya ekleyin (GET, POST, vb.)
        config.addAllowedMethod("*");

        // İzin vermek istediğiniz başlıkları buraya ekleyin (Authorization, Content-Type, vb.)
        config.addAllowedHeader("*");

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
