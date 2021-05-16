package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone smartphone1 = new Smartphone(3, "iPhone 12", 79_990, "Apple");
    private Smartphone smartphone2 = new Smartphone(4, "iPhone 12 Pro", 99_990, "Apple");

    @Test
    void shouldMatchesName(){
        boolean actual = smartphone1.matches("iPhone 12");
        assertTrue(actual);
    }

    @Test
    void shouldMatchesManufacturer(){
        boolean actual = smartphone1.matches("Apple");
        assertTrue(actual);
    }
}