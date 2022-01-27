package org.hellotech.model;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@Builder // complex builder
public class Restaurant {

    private int id;
    private String name;
    private Menu menu; // already a builder

    // our specific need
    public Restaurant(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
