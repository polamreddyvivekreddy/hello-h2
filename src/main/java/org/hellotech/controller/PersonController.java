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

    @GetMapping("/persons-all-registered")
    // private methods works sometimes as Spring uses Reflection but SONAR suggests usage of public methods for @RequestMapping
    public Iterable<Person> getAllRegisteredPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/persons-all-with-no-name")
    public Iterable<Person> getPersonsWithNoName(){
        return personService.getPersonsWithNoName();
    }

    @GetMapping("/persons-by-page")
    public Iterable<Person> getPersonsByPage(int pageNumber, int itemsPerPage){
        return personService.getPersonsByPage(pageNumber, itemsPerPage);
    }
}
