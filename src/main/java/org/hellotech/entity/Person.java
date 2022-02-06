package org.hellotech.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter // In order for PersonController to return proper values, without getMethod() null is returned
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    private int uid;

    private String name;

    private double age;

    private String dateOfBirth;


}
