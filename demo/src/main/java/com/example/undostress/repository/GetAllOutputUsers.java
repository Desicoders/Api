package com.example.undostress.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.undostress.pojo.OutputAllUsers;

public interface GetAllOutputUsers extends JpaRepository<OutputAllUsers, Integer> {

}
