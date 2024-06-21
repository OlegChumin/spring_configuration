package spring_to_remember.lesson_06.annotation_config_2.models;

import org.springframework.stereotype.Component;

/**
 * Простой пример класса с имплементацией интерфейса
 */


public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Cat Meow-Meow");
    }
}
