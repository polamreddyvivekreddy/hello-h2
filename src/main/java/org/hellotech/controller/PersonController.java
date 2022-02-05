package org.hellotech.controller;

import org.hellotech.entity.Person;
import org.hellotech.service.PersonService;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/add-new-person")
    public Person addNewPerson(int uid, String name, int age, String dateOfBirth) {
        return personService.addNewPerson(uid, name, age, dateOfBirth);
    }

    @PostMapping("/add-all-persons")
    public Iterable<Person> addAllPersons(@RequestBody Iterable<Person> persons){
        return personService.addAllPersons(persons);
    }

    @GetMapping("/persons-count")
    public long getCountOfPersons() {
        return personService.getCountOfPersons();
    }

    @GetMapping("/persons-count-with-no-name")
    public long getCountOfPersonsWithNoName() {
        return personService.getCountOfPersonsWithNoName();
    }

    @GetMapping("/persons-all-registered")
    // private methods works sometimes as Spring uses Reflection but SONAR suggests usage of public methods for @RequestMapping
    public Iterable<Person> getAllRegisteredPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/person-as-per-id")
    public Optional<Person> getPersonAsPerProvidedId(int id) {
        return personService.getPersonAsPerProvidedId(id);
    }

    @GetMapping("/persons-all-with-no-name")
    public Iterable<Person> getPersonsWithNoName() {
        return personService.getPersonsWithNoName();
    }

    @GetMapping("/persons-by-page")
    public Iterable<Person> getPersonsByPage(int pageNumber, int itemsPerPage) {
        return personService.getPersonsByPage(pageNumber, itemsPerPage);
    }

    @GetMapping("/persons-sort-by-uid")
    public Iterable<Person> getPersonsSortByUid(Sort.Direction direction) {
        // direction allowed values: ASC, DESC
        return personService.getPersonsSortByUid(direction);
    }

    @GetMapping("/persons-by-page-and-sort-by-name")
    public Iterable<Person> getPersonsByPageAndSortByName(int pageNumber, int itemsPerPage, Sort.Direction direction) {
        return personService.getPersonsByPageAndSortByName(pageNumber, itemsPerPage, direction);
    }

    @GetMapping("/persons-by-page-sort-by-age-and-having-no-name")
    public Iterable<Person> getPersonsByPageSortByAgeAndHavingNoName(int pageNumber, int itemsPerPage, Sort.Direction direction) {
        return personService.getPersonsByPageSortByAgeAndHavingNoName(pageNumber, itemsPerPage, direction);
    }

    @DeleteMapping("/person-delete-by-uid")
    public void deletePersonByUid(int uid) {
        personService.deletePersonByUid(uid);
    }
}
