package org.hellotech.service;

import org.hellotech.entity.Person;
import org.hellotech.repository.PersonRepository;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonAsPerProvidedId(int id) {
        return personRepository.findById(id);
    }

    public Iterable<Person> getPersonsWithNoName() {
        Person personWithNoName = new Person();
        personWithNoName.setUid(80);
        personWithNoName.setAge(30);
        personWithNoName.setName("");
        personWithNoName.setDateOfBirth("01-Jan-2000");

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.exact()).withIgnorePaths("uid", "age", "dateOfBirth");
        Example<Person> personExample = Example.of(personWithNoName, exampleMatcher);

        return personRepository.findAll(personExample);
    }

    public Iterable<Person> getPersonsByPage(int pageNumber, int itemsPerPage) {
        // page is 0 based index
        return personRepository.findAll(PageRequest.of(pageNumber, itemsPerPage));
    }

    public Iterable<Person> getPersonsSortByUid(Sort.Direction direction) {
        return personRepository.findAll(Sort.by(direction, "uid"));
    }

    public Iterable<Person> getPersonsByPageAndSortByName(int pageNumber, int itemsPerPage, Sort.Direction direction) {
        return personRepository.findAll(PageRequest.of(pageNumber, itemsPerPage, Sort.by(direction, "name")));
    }

    public Iterable<Person> getPersonsByPageSortByAgeAndHavingNoName(int pageNumber, int itemsPerPage, Sort.Direction direction) {
        Person personWithNoName = new Person();
        personWithNoName.setUid(80);
        personWithNoName.setAge(30);
        personWithNoName.setName("");
        personWithNoName.setDateOfBirth("01-Jan-2000");

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.exact()).withIgnorePaths("uid", "age", "dateOfBirth");
        Example<Person> personExample = Example.of(personWithNoName, exampleMatcher);

        Pageable personPage = PageRequest.of(pageNumber, itemsPerPage, Sort.by(direction, "age"));
        return personRepository.findAll(personExample, personPage);
    }


    public Person addNewPerson(int uid, String name, int age, String dateOfBirth) {
        // flush ensures commit to db otherwise data lost after end of session
        return personRepository.saveAndFlush(new Person(uid, name, age, dateOfBirth));
    }

    public long getCountOfPersons() {
        return personRepository.count();
    }
}
