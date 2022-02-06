package org.hellotech.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int day;

    private String breakfast;

    // By default maps primary key of Person
    // By default uses eager fetching
    @OneToOne(fetch = FetchType.LAZY)
    private Person person;

    /*@ManyToOne
    @JoinColumn(name = "uid_fk")
    private Person person;*/

    /*@ManyToOne
    @JoinTable(name = "FOOD_PERSON")
    private Person person;*/


}
