package com.example.demo.infra.persist.repo;

import com.example.demo.infra.persist.po.PersonPO;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends R2dbcRepository<PersonPO, Long> {
}
