package org.hellotech;

import lombok.extern.slf4j.Slf4j;
import org.hellotech.entity.Delivery;
import org.hellotech.entity.Food;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@SpringBootApplication
@Slf4j
public class CommandLineApp implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommandLineApp.class);

    private final EntityManager entityManager;

    public CommandLineApp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public static void main(String[] args) {

        SpringApplication.run(CommandLineApp.class);
        LOGGER.info("hello after spring run");

    }

    @Override
    @Transactional
    public void run(String... args) {
        //Check @OneToOne UniDirectional
        Food food = entityManager.find(Food.class, 1);
        log.info("food: {}", food);
        log.info("foodEatenByPerson: {}", food.getPerson());

        //Check @OneToOne BiDirectional
        Food anotherFood = entityManager.find(Food.class, 2);
        log.info("food: {}", food);
        log.info("foodDelivery: {}", food.getDelivery());

        //Check @OneToOne BiDirectional
        Delivery delivery = entityManager.find(Delivery.class,201);
        log.info("delivery: {}", delivery);
        log.info("deliveredFood: {}",delivery.getFood());

    }
}
