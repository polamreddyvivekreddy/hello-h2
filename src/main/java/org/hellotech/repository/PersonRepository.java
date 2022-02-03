package org.hellotech.repository;

import org.hellotech.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

// JpaRepository has more features( ExampleMatcher, Pageable) than CrudRepository
public interface PersonRepository extends JpaRepository<Person, Integer> {


}


