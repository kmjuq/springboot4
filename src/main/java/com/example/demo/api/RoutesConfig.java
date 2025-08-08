package com.example.demo.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


@Configuration
public class RoutesConfig {

    @Bean
    public RouterFunction<ServerResponse> demoRoutes(DemoHandler demoHandler){
        return RouterFunctions.route()
                .path("/demo",builder -> builder
                        .GET("/{id}",demoHandler::findOne)
                        .build()
                )
                .build();
    }

}
