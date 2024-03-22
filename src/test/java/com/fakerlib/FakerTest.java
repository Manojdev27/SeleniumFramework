package com.fakerlib;

import com.github.javafaker.Faker;

public class FakerTest {
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {
//            System.out.println(faker.address().cityName());
//            System.out.println(faker.superhero().name());
//            System.out.println(faker.number().numberBetween(5,500));
//            System.out.println(faker.idNumber().valid());
            System.out.println(faker.harryPotter().character());
        }
    }
    
}
