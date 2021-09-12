package org.hellotech.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int day;

    private String breakfast;

    /*@ManyToOne
    @JoinColumn(name = "uid_fk")
    private Person person;*/

    @ManyToOne
    @JoinTable(name = "FOOD_PERSON")
    private Person person;

    public Food() {
    }

    public Food( String breakfast, Person person) {

        this.breakfast = breakfast;
        this.person = person;
    }
}
