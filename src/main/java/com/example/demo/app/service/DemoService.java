package com.example.demo.app.service;

import com.example.demo.domain.model.entity.Person;
import com.example.demo.infra.persist.convert.PersonConvert;
import com.example.demo.infra.persist.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class DemoService {

    private final PersonRepository personRepository;

    public Mono<Person> findOne(Long id) {
        return personRepository.findById(id).map(PersonConvert.INSTANCE::po2domain);
    }

}
