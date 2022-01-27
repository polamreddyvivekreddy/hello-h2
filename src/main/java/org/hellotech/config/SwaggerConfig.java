package org.hellotech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket getSwaggerAPI(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo()).groupName("Restaurant APIs")
                .select().apis(RequestHandlerSelectors.basePackage("org.hellotech.controller"))
                .build();
    }

    private ApiInfo getApiInfo(){
        return new ApiInfoBuilder().title("Restaurant Base")
                .description("Ref Guide")
                .license("MITT")
                .build();
    }

}
