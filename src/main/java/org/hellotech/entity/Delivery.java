package org.hellotech.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Delivery {

    @Id
    private int id;

    private String address;

    @OneToOne(mappedBy = "delivery")  // BiDirectional & Non-Owning side
    private Food food;


}
