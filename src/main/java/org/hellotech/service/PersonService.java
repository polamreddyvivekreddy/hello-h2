package org.hellotech.service;

import org.hellotech.entity.Person;
import org.hellotech.repository.PersonRepository;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
