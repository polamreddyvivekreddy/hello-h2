package org.hellotech.controller;

import org.hellotech.entity.Person;
import org.hellotech.service.PersonService;
import org.springframework.data.domain.Sort;
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

    @GetMapping("/persons-sort-by-uid")
    public Iterable<Person> getPersonsSortByUid(Sort.Direction direction){
        // direction allowed values: ASC, DESC
        return personService.getPersonsSortByUid(direction);
    }

    @GetMapping("/persons-by-page-sort-by-age-and-having-no-name")
    public Iterable<Person> getPersonsByPageSortByAgeAndHavingNoName(int pageNumber, int itemsPerPage, Sort.Direction direction){
        return personService.getPersonsByPageSortByAgeAndHavingNoName(pageNumber, itemsPerPage, direction);
    }
}
