package com.example.demo.infra.repo;

import com.example.demo.infra.entity.PersonDO;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends R2dbcRepository<PersonDO, Long> {
}
