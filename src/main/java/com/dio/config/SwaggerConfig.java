package com.dio.config;

import java.util.Arrays;
import java.util.HashSet;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class SwaggerConfig {
        @Bean
        public OpenAPI openAPI() {
            return new OpenAPI()
                    .info(new Info()
                            .title("Title - Rest API")
                            .description("API exemplo de uso de Springboot REST API")
                            .version("1.0")
                            .termsOfService("Termo de uso: Open Source")
                            .license(new License()
                                    .name("Apache 2.0")
                                    .url("http://www.seusite.com.br")
                            )
                    ).externalDocs(
                            new ExternalDocumentation()
                            .description("Seu nome")
                            .url("http://www.seusite.com.br"));
        }

}


//    private Contact contato() {
//        return new Contact(
//                "Seu nome",
//                "http://www.seusite.com.br",
//                "voce@seusite.com.br");
//    }


//    private ApiInfoBuilder informacoesApi() {
//
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//
//        apiInfoBuilder.title("Title - Rest API");
//        apiInfoBuilder.description("API exemplo de uso de Springboot REST API");
//        apiInfoBuilder.version("1.0");
//        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
//        apiInfoBuilder.license("Licença - Sua Empresa");
//        apiInfoBuilder.licenseUrl("http://www.seusite.com.br");
//        apiInfoBuilder.contact(this.contato());
//
//        return apiInfoBuilder;
//
//    }
//    @Bean
//    public Docket detalheApi() {
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//
//        docket
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.dio.controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(this.informacoesApi().build())
//                .consumes(new HashSet<String>(Arrays.asList("application/json")))
//                .produces(new HashSet<String>(Arrays.asList("application/json")));
//
//        return docket;
//    }
//}