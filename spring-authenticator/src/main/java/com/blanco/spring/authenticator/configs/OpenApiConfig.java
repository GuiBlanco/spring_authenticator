package com.blanco.spring.authenticator.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI(){
    return new OpenAPI()
            .info(new Info()
                    .title("RestFull Authenticator")
                    .version("v1")
                    .description("Authenticator service for APIs")
                    .termsOfService("https://github.com/blangui")
                    .license(
                            new License().
                                    name("Apache 2.0")
                                    .url("https://github.com/guiblanco")));


}

}
