package com.hackathon.server.global.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Components components = new Components().addSecuritySchemes("bearerAuth", getJwtSecurityScheme());
        SecurityRequirement securityItem = new SecurityRequirement().addList("bearerAuth");

        Info info = new Info()
                .title("메디럭스X잇타 해커톤 2조")
                .version("v0.0.1")
                .description("메디럭스X잇타 해커톤 2조 API 명세서입니다.");

        return new OpenAPI()
                .components(components)
                .info(info)
                .addSecurityItem(securityItem);
    }

    private SecurityScheme getJwtSecurityScheme() {
        return new SecurityScheme()
                .type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")
                .in(SecurityScheme.In.HEADER)
                .name("Authorization");
    }
}

