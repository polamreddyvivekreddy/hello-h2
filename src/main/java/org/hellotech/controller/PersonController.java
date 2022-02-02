package org.hellotech.controller;

import org.hellotech.entity.Person;
import org.hellotech.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public Iterable<Person> getAllRegisteredPersons() {
        return personService.getAllPersons();
    }
}
