package spring_to_remember.lesson_08.aop_around.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Война и мир")
    private String name;

    @Value("Л.Н. Толстой")
    private String author;

    @Value("1865")
    private int yearOfPublishing;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
}
