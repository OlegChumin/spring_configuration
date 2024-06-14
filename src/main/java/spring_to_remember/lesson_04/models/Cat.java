package spring_to_remember.lesson_04.models;

public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Cat Meow-Meow");
    }
}
