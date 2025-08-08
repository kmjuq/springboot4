package com.example.demo.api;

import com.example.demo.domain.entity.Person;
import com.example.demo.infra.assembler.PersonMapper;
import com.example.demo.infra.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final PersonRepository personRepository;

    public Mono<Person> findOne(Long id) {
        return personRepository.findById(id).map(PersonMapper.INSTANCE::do2domain);
    }

}
