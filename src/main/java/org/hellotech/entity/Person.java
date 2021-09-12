package org.hellotech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private int uid;

    private String name;

    private double age;

    private String dateOfBirth;

    public Person() {
    }

    public Person(int uid, String name, double age, String dateOfBirth) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }
}
