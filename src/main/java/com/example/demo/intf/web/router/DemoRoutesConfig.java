package com.example.demo.intf.web.router;

import com.example.demo.intf.web.handler.DemoHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


@Configuration
public class DemoRoutesConfig {

    @Bean
    public RouterFunction<ServerResponse> demoRoutes(DemoHandler demoHandler){
        return RouterFunctions.route()
                .path(
                        "/demo",
                        builder -> builder
                                .GET("/{id}",demoHandler::findOne)
                                .build()
                )
                .build();
    }

}
