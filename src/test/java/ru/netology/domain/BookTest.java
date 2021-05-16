package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book1 = new Book(1, "Игра престолов", 600, "Джордж Р. Р. Мартин");
    private Book book2 = new Book(2, "Cоланин", 800, "Инио Асано");

    @Test
    void shouldMatchesName() {
        boolean actual = book1.matches("Игра престолов");
        assertTrue(actual);
    }

    @Test
    void shouldMatchesAuthor() {
        boolean actual = book2.matches("Инио Асано");
        assertTrue(actual);
    }
}