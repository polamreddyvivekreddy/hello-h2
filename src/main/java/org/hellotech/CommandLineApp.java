package org.hellotech;

import org.hellotech.entity.Food;
import org.hellotech.entity.Person;
import org.hellotech.model.Restaurant;
import org.hellotech.repository.FoodRepository;
import org.hellotech.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommandLineApp.class);


    public CommandLineApp(PersonRepository personRepository, FoodRepository foodRepository) {
        Person person = new Person(1001, "Vivek", 21, "18-02-1999");
        personRepository.save(person);

        foodRepository.save(new Food("Dosa", person));
        foodRepository.save(new Food("Idli", person));
        foodRepository.save(new Food("Poori", person));
    }

    public static void main(String[] args) {

        SpringApplication.run(CommandLineApp.class);
        LOGGER.info("hello after spring run");

        Restaurant restaurant = new Restaurant();
        restaurant.setId(1);
        restaurant.setName("Babai Hotel");
        LOGGER.info("restaurant.getId() {}",restaurant.getId());
        LOGGER.info("restaurant.getName() {}",restaurant.getName());


    }
}
