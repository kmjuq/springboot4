package com.example.demo.infra.assembler;

import com.example.demo.domain.entity.Person;
import com.example.demo.infra.entity.PersonDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );

    Person do2domain(PersonDO personDO);
}