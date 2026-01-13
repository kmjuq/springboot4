package com.example.demo.infra.persist.convert;

import com.example.demo.domain.model.entity.Person;
import com.example.demo.infra.persist.po.PersonPO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonConvert {

    PersonConvert INSTANCE = Mappers.getMapper(PersonConvert.class);

    Person po2domain(PersonPO personPO);
}