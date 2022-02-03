package org.hellotech.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter // In order for PersonController to return proper values, without getMethod() null is returned
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    private int uid;

    private String name;

    private double age;

    private String dateOfBirth;


}
