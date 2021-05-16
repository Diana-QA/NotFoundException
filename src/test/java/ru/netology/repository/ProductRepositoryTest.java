package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.exception.NotFoundException;
import ru.netology.manager.ProductManager;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book book1 = new Book(1, "Игра престолов", 600, "Джордж Р. Р. Мартин");
    private Book book2 = new Book(2, "Cоланин", 800, "Инио Асано");
    private Smartphone smartphone1 = new Smartphone(3, "iPhone 12", 79_990, "Apple");
    private Smartphone smartphone2 = new Smartphone(4, "iPhone 12 Pro", 99_990, "Apple");

    @BeforeEach
    public void setUp() {
        repository.save(book1);
        repository.save(book2);
        repository.save(smartphone1);
        repository.save(smartphone2);
    }

    @Test
    public void removeById() {
        repository.removeById(1);
        Product[] actual = repository.findAll();
        Product[] expected = new Product[]{book2, smartphone1, smartphone2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void removeByIdNonExistent() {
        assertThrows(NotFoundException.class, () -> repository.removeById(5));
    }
}