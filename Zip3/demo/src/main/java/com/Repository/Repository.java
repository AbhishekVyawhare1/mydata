package com.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.entities.Employee;

public interface Repository extends MongoRepository<Employee, Integer> {

}
