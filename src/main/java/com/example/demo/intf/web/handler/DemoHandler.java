package com.example.demo.intf.web.handler;

import com.example.demo.app.service.DemoService;
import com.example.demo.domain.model.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@RequiredArgsConstructor
public class DemoHandler {

    private final DemoService demoService;

    public Mono<ServerResponse> findOne(ServerRequest request) {
        String id = request.pathVariable("id");
        Mono<Person> people = demoService.findOne(Long.valueOf(id));
        return ok().contentType(APPLICATION_JSON).body(people, Person.class);
    }

}
